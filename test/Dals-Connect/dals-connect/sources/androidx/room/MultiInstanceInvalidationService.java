package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f, reason: collision with root package name */
    int f1606f = 0;

    /* renamed from: g, reason: collision with root package name */
    final HashMap<Integer, String> f1607g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    final RemoteCallbackList<d> f1608h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final e.a f1609i = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<d> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f1607g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends e.a {
        b() {
        }

        @Override // androidx.room.e
        public void U6(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1608h) {
                String str = MultiInstanceInvalidationService.this.f1607g.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1608h.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f1608h.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1607g.get(Integer.valueOf(intValue));
                        if (i2 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f1608h.getBroadcastItem(i3).y1(strArr);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f1608h.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.e
        public int b2(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1608h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f1606f + 1;
                multiInstanceInvalidationService.f1606f = i2;
                if (multiInstanceInvalidationService.f1608h.register(dVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f1607g.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1606f--;
                return 0;
            }
        }

        @Override // androidx.room.e
        public void s7(d dVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f1608h) {
                MultiInstanceInvalidationService.this.f1608h.unregister(dVar);
                MultiInstanceInvalidationService.this.f1607g.remove(Integer.valueOf(i2));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1609i;
    }
}
