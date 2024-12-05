package com.uptodown.workers;

import E4.j;
import M5.AbstractC1246t;
import N4.h;
import N4.q;
import X4.C1496f;
import X4.C1509t;
import X4.O;
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
import g6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class InstallUpdatesWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30043b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30044a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final boolean a(Context context) {
            boolean z8;
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            boolean Y7 = aVar.Y(context);
            boolean x8 = new C3319g().x(context);
            if (aVar.O(context) && !x8) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (j.f2274g.h() != null) {
                return false;
            }
            if ((!Y7 && !z8) || UptodownApp.f28003B.W("InstallUpdatesWorker", context)) {
                return false;
            }
            return true;
        }

        public final void b(Context context) {
            AbstractC3159y.i(context, "context");
            if (a(context)) {
                WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(InstallUpdatesWorker.class).addTag("InstallUpdatesWorker").build());
            } else {
                UploadFileWorker.f30079c.a(context);
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallUpdatesWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30044a = context;
        this.f30044a = j.f2274g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(O update1, O update2) {
        AbstractC3159y.i(update1, "update1");
        AbstractC3159y.i(update2, "update2");
        if (update1.i() == null) {
            return -1;
        }
        if (update2.i() == null) {
            return 1;
        }
        C1509t i8 = update1.i();
        AbstractC3159y.f(i8);
        int a8 = i8.a();
        C1509t i9 = update2.i();
        AbstractC3159y.f(i9);
        if (a8 < i9.a()) {
            return -1;
        }
        C1509t i10 = update1.i();
        AbstractC3159y.f(i10);
        int a9 = i10.a();
        C1509t i11 = update2.i();
        AbstractC3159y.f(i11);
        if (a9 > i11.a()) {
            return 1;
        }
        return 0;
    }

    private final boolean c(Context context, C1496f c1496f) {
        if (n.s(context.getPackageName(), c1496f.Q(), true)) {
            return true;
        }
        if (c1496f.i() == 0 && c1496f.i0(context)) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        int i8;
        boolean z8;
        C1496f S7;
        PackageInfo packageInfo;
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        boolean Y7 = aVar.Y(this.f30044a);
        if (aVar.O(this.f30044a) || Y7) {
            C1509t.f12711e.a(this.f30044a);
            File g8 = new C3329q().g(this.f30044a);
            C3326n.a aVar2 = C3326n.f34504t;
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            C3326n a8 = aVar2.a(applicationContext);
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
                if (o8.f() == 0 && o8.j() != null && o8.o() == 100) {
                    String j8 = o8.j();
                    AbstractC3159y.f(j8);
                    File file = new File(g8, j8);
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        AbstractC3159y.h(absolutePath, "fileUpdateDownloaded.absolutePath");
                        o8.Q(a8.f0(absolutePath));
                        if (o8.i() != null) {
                            C1509t i9 = o8.i();
                            AbstractC3159y.f(i9);
                            if (i9.a() < 3) {
                            }
                        }
                        arrayList.add(o8);
                    }
                }
            }
            AbstractC1246t.B(arrayList, new Comparator() { // from class: q5.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b8;
                    b8 = InstallUpdatesWorker.b((O) obj, (O) obj2);
                    return b8;
                }
            });
            boolean x8 = new C3319g().x(this.f30044a);
            Iterator it2 = arrayList.iterator();
            while (true) {
                z8 = false;
                if (!it2.hasNext()) {
                    break;
                }
                O o9 = (O) it2.next();
                if (o9.f() == 0 && o9.j() != null && o9.o() == 100 && (S7 = a8.S(o9.n())) != null && c(this.f30044a, S7)) {
                    String j9 = o9.j();
                    AbstractC3159y.f(j9);
                    File file2 = new File(g8, j9);
                    if (file2.exists()) {
                        if (o9.i() != null) {
                            C1509t i10 = o9.i();
                            AbstractC3159y.f(i10);
                            if (i10.a() >= i8) {
                                continue;
                            }
                        }
                        if (o9.i() == null) {
                            o9.Q(new C1509t());
                            C1509t i11 = o9.i();
                            AbstractC3159y.f(i11);
                            i11.e(1);
                            C1509t i12 = o9.i();
                            AbstractC3159y.f(i12);
                            i12.h(String.valueOf(System.currentTimeMillis()));
                            C1509t i13 = o9.i();
                            AbstractC3159y.f(i13);
                            i13.f(file2.getAbsolutePath());
                            C1509t i14 = o9.i();
                            AbstractC3159y.f(i14);
                            a8.I0(i14);
                        } else {
                            C1509t i15 = o9.i();
                            AbstractC3159y.f(i15);
                            i15.e(i15.a() + 1);
                            C1509t i16 = o9.i();
                            AbstractC3159y.f(i16);
                            i16.h(String.valueOf(System.currentTimeMillis()));
                            C1509t i17 = o9.i();
                            AbstractC3159y.f(i17);
                            a8.t1(i17);
                        }
                        if (Y7) {
                            String j10 = o9.j();
                            AbstractC3159y.f(j10);
                            if (n.q(j10, ".apk", true)) {
                                UptodownApp.a.Z(UptodownApp.f28003B, file2, this.f30044a, null, 4, null);
                                break;
                            }
                        } else if (x8) {
                            continue;
                        } else {
                            try {
                                PackageManager packageManager = this.f30044a.getPackageManager();
                                AbstractC3159y.h(packageManager, "context.packageManager");
                                packageInfo = q.d(packageManager, o9.n(), 128);
                            } catch (PackageManager.NameNotFoundException unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                h hVar = new h(this.f30044a, null);
                                if (!hVar.y(packageInfo.applicationInfo.targetSdkVersion)) {
                                    continue;
                                } else {
                                    if (AbstractC3159y.d(this.f30044a.getPackageName(), new C3319g().h(this.f30044a, o9.n()))) {
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
            a8.g();
            if (!z8) {
                UploadFileWorker.f30079c.a(this.f30044a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }
}
