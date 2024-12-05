package b5;

import O5.I;
import O5.t;
import a5.C1639f;
import a6.InterfaceC1668n;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3655A;

/* renamed from: b5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC1981f extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15516a = new a(null);

    /* renamed from: b5.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: b5.f$b */
    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f15518b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15519c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f15520d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, int i8, String str, S5.d dVar) {
            super(2, dVar);
            this.f15518b = activity;
            this.f15519c = i8;
            this.f15520d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f15518b, this.f15519c, this.f15520d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15517a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f15518b;
                int i9 = this.f15519c;
                String str = this.f15520d;
                this.f15517a = 1;
                if (appInstalledDetailsActivity.m5(i9, str, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: b5.f$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f15521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f15522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f15523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, T t8, S5.d dVar) {
            super(2, dVar);
            this.f15522b = activity;
            this.f15523c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f15522b, this.f15523c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f15521a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                AppDetailActivity appDetailActivity = (AppDetailActivity) this.f15522b;
                Object obj2 = this.f15523c.f34162a;
                AbstractC3255y.f(obj2);
                this.f15521a = 1;
                if (appDetailActivity.v3((String) obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public ResultReceiverC1981f(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        String str;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (UptodownApp.f29058B.Q()) {
            C3655A c3655a = C3655A.f36474a;
            if (c3655a.d().size() > 0) {
                Object obj = c3655a.d().get(c3655a.d().size() - 1);
                AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                Activity activity = (Activity) obj;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                String str4 = null;
                ArrayList arrayList2 = null;
                String str5 = null;
                if (activity instanceof Updates) {
                    if (i8 != 104) {
                        if (i8 != 105) {
                            if (i8 != 110) {
                                if (bundle != null) {
                                    str3 = bundle.getString("packagename");
                                }
                                Updates updates = (Updates) activity;
                                updates.k5(i8, str3);
                                if (updates.i4()) {
                                    updates.v4(i8);
                                    return;
                                }
                                return;
                            }
                            activity.runOnUiThread(new AbstractActivityC2683a.b());
                            return;
                        }
                        if (bundle != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable", C1639f.class);
                            } else {
                                parcelableArrayList2 = bundle.getParcelableArrayList("apps_parcelable");
                            }
                            arrayList = parcelableArrayList2;
                        }
                        if (arrayList != null) {
                            ((Updates) activity).h5(arrayList);
                            return;
                        }
                        return;
                    }
                    ((Updates) activity).k5(104, null);
                    return;
                }
                if (activity instanceof MyApps) {
                    if (i8 != 105) {
                        if (i8 != 110) {
                            MyApps myApps = (MyApps) activity;
                            if (myApps.i4()) {
                                myApps.v4(i8);
                                return;
                            }
                            if (bundle != null) {
                                str4 = bundle.getString("packagename");
                            }
                            myApps.a5(i8, str4);
                            return;
                        }
                        activity.runOnUiThread(new AbstractActivityC2683a.b());
                        return;
                    }
                    if (bundle != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable", C1639f.class);
                        } else {
                            parcelableArrayList = bundle.getParcelableArrayList("apps_parcelable");
                        }
                        arrayList2 = parcelableArrayList;
                    }
                    if (arrayList2 != null) {
                        ((MyApps) activity).U4(arrayList2);
                        return;
                    }
                    return;
                }
                if (activity instanceof AppInstalledDetailsActivity) {
                    if (i8 != 105 && i8 != 110) {
                        if (bundle != null) {
                            str = bundle.getString("packagename");
                        } else {
                            str = null;
                        }
                        AbstractC3364k.d(N.a(C3347b0.c()), null, null, new b(activity, i8, str, null), 3, null);
                        return;
                    }
                    activity.runOnUiThread(new AbstractActivityC2683a.b());
                    return;
                }
                if (activity instanceof MainActivity) {
                    if (i8 == 103) {
                        ((MainActivity) activity).F7();
                    }
                    if (bundle != null) {
                        str5 = bundle.getString("packagename");
                    }
                    MainActivity mainActivity = (MainActivity) activity;
                    activity.runOnUiThread(new MainActivity.RunnableC2676e(i8, str5));
                    mainActivity.I7(str5);
                    return;
                }
                if (activity instanceof AppDetailActivity) {
                    T t8 = new T();
                    if (bundle != null) {
                        t8.f34162a = bundle.getString("packagename");
                    }
                    activity.runOnUiThread(new AppDetailActivity.b(i8, (String) t8.f34162a));
                    if (t8.f34162a != null) {
                        AbstractC3364k.d(N.a(C3347b0.c()), null, null, new c(activity, t8, null), 3, null);
                        return;
                    }
                    return;
                }
                if (activity instanceof WishlistActivity) {
                    if (bundle != null) {
                        str2 = bundle.getString("packagename");
                    }
                    ((WishlistActivity) activity).U4(str2);
                }
            }
        }
    }
}
