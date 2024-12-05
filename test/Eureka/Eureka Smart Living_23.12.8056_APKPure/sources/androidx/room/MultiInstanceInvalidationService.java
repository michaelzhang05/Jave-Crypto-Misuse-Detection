package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import f5.h;
import h0.b;
import java.util.LinkedHashMap;
import java.util.Map;
import z4.k;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private int f3619a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f3620b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final RemoteCallbackList f3621c = new b();

    /* renamed from: d, reason: collision with root package name */
    private final b.a f3622d = new a();

    /* loaded from: classes.dex */
    public static final class a extends b.a {
        a() {
        }

        @Override // h0.b
        public int d(h0.a aVar, String str) {
            h.e(aVar, "callback");
            int i6 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList a6 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a6) {
                multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                int c6 = multiInstanceInvalidationService.c();
                if (multiInstanceInvalidationService.a().register(aVar, Integer.valueOf(c6))) {
                    multiInstanceInvalidationService.b().put(Integer.valueOf(c6), str);
                    i6 = c6;
                } else {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                    multiInstanceInvalidationService.c();
                }
            }
            return i6;
        }

        @Override // h0.b
        public void h(h0.a aVar, int i6) {
            h.e(aVar, "callback");
            RemoteCallbackList a6 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a6) {
                multiInstanceInvalidationService.a().unregister(aVar);
            }
        }

        @Override // h0.b
        public void o(int i6, String[] strArr) {
            h.e(strArr, "tables");
            RemoteCallbackList a6 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a6) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i6));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i7 = 0; i7 < beginBroadcast; i7++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i7);
                        h.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(intValue));
                        if (i6 != intValue && h.a(str, str2)) {
                            try {
                                ((h0.a) multiInstanceInvalidationService.a().getBroadcastItem(i7)).r(strArr);
                            } catch (RemoteException e6) {
                                Log.w("ROOM", "Error invoking a remote callback", e6);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                k kVar = k.f10059a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(h0.a aVar, Object obj) {
            h.e(aVar, "callback");
            h.e(obj, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f3621c;
    }

    public final Map b() {
        return this.f3620b;
    }

    public final int c() {
        return this.f3619a;
    }

    public final void d(int i6) {
        this.f3619a = i6;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f3622d;
    }
}
