package com.uptodown.workers;

import H4.j;
import P5.AbstractC1378t;
import Q4.h;
import Q4.q;
import a5.C1639f;
import a5.C1652t;
import a5.O;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;

/* loaded from: classes5.dex */
public final class InstallUpdatesWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31075b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31076a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final boolean a(Context context) {
            boolean z8;
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            boolean Y7 = aVar.Y(context);
            boolean x8 = new C3667g().x(context);
            if (aVar.O(context) && !x8) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (j.f3824g.h() != null) {
                return false;
            }
            if ((!Y7 && !z8) || UptodownApp.f29058B.W("InstallUpdatesWorker", context)) {
                return false;
            }
            return true;
        }

        public final void b(Context context) {
            AbstractC3255y.i(context, "context");
            if (a(context)) {
                WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(InstallUpdatesWorker.class).addTag("InstallUpdatesWorker").build());
            } else {
                UploadFileWorker.f31111c.a(context);
            }
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallUpdatesWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31076a = context;
        this.f31076a = j.f3824g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(O update1, O update2) {
        AbstractC3255y.i(update1, "update1");
        AbstractC3255y.i(update2, "update2");
        if (update1.i() == null) {
            return -1;
        }
        if (update2.i() == null) {
            return 1;
        }
        C1652t i8 = update1.i();
        AbstractC3255y.f(i8);
        int a8 = i8.a();
        C1652t i9 = update2.i();
        AbstractC3255y.f(i9);
        if (a8 < i9.a()) {
            return -1;
        }
        C1652t i10 = update1.i();
        AbstractC3255y.f(i10);
        int a9 = i10.a();
        C1652t i11 = update2.i();
        AbstractC3255y.f(i11);
        if (a9 > i11.a()) {
            return 1;
        }
        return 0;
    }

    private final boolean c(Context context, C1639f c1639f) {
        if (n.s(context.getPackageName(), c1639f.J(), true)) {
            return true;
        }
        if (c1639f.i() == 0 && c1639f.i0(context)) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        int i8;
        boolean z8;
        C1639f S8;
        PackageInfo packageInfo;
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        boolean Y7 = aVar.Y(this.f31076a);
        if (aVar.O(this.f31076a) || Y7) {
            C1652t.f14332e.a(this.f31076a);
            File g8 = new C3677q().g(this.f31076a);
            C3674n.a aVar2 = C3674n.f36505t;
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            C3674n a8 = aVar2.a(applicationContext);
            a8.a();
            ArrayList v02 = a8.v0();
            ArrayList arrayList = new ArrayList();
            Iterator it = v02.iterator();
            while (true) {
                i8 = 3;
                if (!it.hasNext()) {
                    break;
                }
                O o8 = (O) it.next();
                if (o8.h() == 0 && o8.l() != null && o8.u() == 100) {
                    String l8 = o8.l();
                    AbstractC3255y.f(l8);
                    File file = new File(g8, l8);
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        AbstractC3255y.h(absolutePath, "fileUpdateDownloaded.absolutePath");
                        o8.J(a8.f0(absolutePath));
                        if (o8.i() != null) {
                            C1652t i9 = o8.i();
                            AbstractC3255y.f(i9);
                            if (i9.a() < 3) {
                            }
                        }
                        arrayList.add(o8);
                    }
                }
            }
            AbstractC1378t.B(arrayList, new Comparator() { // from class: t5.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b8;
                    b8 = InstallUpdatesWorker.b((O) obj, (O) obj2);
                    return b8;
                }
            });
            boolean x8 = new C3667g().x(this.f31076a);
            Iterator it2 = arrayList.iterator();
            while (true) {
                z8 = false;
                if (!it2.hasNext()) {
                    break;
                }
                O o9 = (O) it2.next();
                if (o9.h() == 0 && o9.l() != null && o9.u() == 100 && (S8 = a8.S(o9.s())) != null && c(this.f31076a, S8)) {
                    String l9 = o9.l();
                    AbstractC3255y.f(l9);
                    File file2 = new File(g8, l9);
                    if (file2.exists()) {
                        if (o9.i() != null) {
                            C1652t i10 = o9.i();
                            AbstractC3255y.f(i10);
                            if (i10.a() >= i8) {
                                continue;
                            }
                        }
                        if (o9.i() == null) {
                            o9.J(new C1652t());
                            C1652t i11 = o9.i();
                            AbstractC3255y.f(i11);
                            i11.e(1);
                            C1652t i12 = o9.i();
                            AbstractC3255y.f(i12);
                            i12.h(String.valueOf(System.currentTimeMillis()));
                            C1652t i13 = o9.i();
                            AbstractC3255y.f(i13);
                            i13.f(file2.getAbsolutePath());
                            C1652t i14 = o9.i();
                            AbstractC3255y.f(i14);
                            a8.I0(i14);
                        } else {
                            C1652t i15 = o9.i();
                            AbstractC3255y.f(i15);
                            i15.e(i15.a() + 1);
                            C1652t i16 = o9.i();
                            AbstractC3255y.f(i16);
                            i16.h(String.valueOf(System.currentTimeMillis()));
                            C1652t i17 = o9.i();
                            AbstractC3255y.f(i17);
                            a8.t1(i17);
                        }
                        if (Y7) {
                            String l10 = o9.l();
                            AbstractC3255y.f(l10);
                            if (n.q(l10, ".apk", true)) {
                                UptodownApp.a.Z(UptodownApp.f29058B, file2, this.f31076a, null, 4, null);
                                break;
                            }
                        } else if (x8) {
                            continue;
                        } else {
                            try {
                                PackageManager packageManager = this.f31076a.getPackageManager();
                                AbstractC3255y.h(packageManager, "context.packageManager");
                                packageInfo = q.d(packageManager, o9.s(), 128);
                            } catch (PackageManager.NameNotFoundException unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                h hVar = new h(this.f31076a, null);
                                if (!hVar.y(packageInfo.applicationInfo.targetSdkVersion)) {
                                    continue;
                                } else {
                                    if (AbstractC3255y.d(this.f31076a.getPackageName(), new C3667g().h(this.f31076a, o9.s()))) {
                                        h.u(hVar, file2, false, 2, null);
                                        break;
                                    }
                                    i8 = 3;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            z8 = true;
            a8.l();
            if (!z8) {
                UploadFileWorker.f31111c.a(this.f31076a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }
}
