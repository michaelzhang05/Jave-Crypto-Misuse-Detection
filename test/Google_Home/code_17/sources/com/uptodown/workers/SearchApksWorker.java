package com.uptodown.workers;

import H4.j;
import Q4.e;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class SearchApksWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31103b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31104a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchApksWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31104a = context;
        this.f31104a = j.f3824g.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(java.io.File r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = "item.name"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
            r2 = 2
            java.lang.String r3 = ".apk"
            r4 = 0
            r5 = 0
            boolean r0 = j6.n.r(r0, r3, r4, r2, r5)
            r2 = -1
            if (r0 == 0) goto L58
            android.content.Context r0 = r9.f31104a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            java.lang.String r1 = "context.packageManager"
            kotlin.jvm.internal.AbstractC3255y.h(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            java.lang.String r1 = r10.getAbsolutePath()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            java.lang.String r6 = "item.absolutePath"
            kotlin.jvm.internal.AbstractC3255y.h(r1, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = Q4.q.c(r0, r1, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L48
            if (r0 == 0) goto L4a
            android.content.Context r1 = r9.f31104a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            if (r1 == 0) goto L4a
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            java.lang.String r7 = "pInfoFile.packageName"
            kotlin.jvm.internal.AbstractC3255y.h(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            android.content.pm.PackageInfo r5 = Q4.q.d(r1, r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            goto L4a
        L46:
            goto L4a
        L48:
            r0 = r5
        L4a:
            if (r0 == 0) goto L56
            Q4.f r1 = new Q4.f
            r1.<init>()
            long r0 = r1.m(r0)
            goto L8d
        L56:
            r0 = r2
            goto L8d
        L58:
            Q4.w$a r0 = Q4.w.f9241b
            java.lang.String r6 = r10.getName()
            kotlin.jvm.internal.AbstractC3255y.h(r6, r1)
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto L56
            Q4.w r0 = new Q4.w
            r0.<init>()
            android.content.Context r1 = r9.f31104a
            N4.f r0 = r0.e(r10, r1)
            if (r0 == 0) goto L8c
            long r6 = r0.b()
            android.content.Context r1 = r9.f31104a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            if (r1 == 0) goto L8a
            java.lang.String r0 = r0.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            android.content.pm.PackageInfo r5 = Q4.q.d(r1, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            goto L8a
        L89:
        L8a:
            r0 = r6
            goto L8d
        L8c:
            return r4
        L8d:
            if (r5 == 0) goto L99
            Q4.f r6 = new Q4.f
            r6.<init>()
            long r5 = r6.m(r5)
            goto L9a
        L99:
            r5 = r2
        L9a:
            r7 = 1
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lc2
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lc1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto Laf
            o5.w r0 = o5.C3683w.f36547a
            android.content.Context r1 = r9.f31104a
            r0.m(r1, r10, r4, r11)
            return r7
        Laf:
            if (r2 >= 0) goto Lb9
            o5.w r0 = o5.C3683w.f36547a
            android.content.Context r1 = r9.f31104a
            r0.m(r1, r10, r7, r11)
            return r7
        Lb9:
            o5.w r0 = o5.C3683w.f36547a
            android.content.Context r1 = r9.f31104a
            r0.m(r1, r10, r4, r11)
            return r7
        Lc1:
            return r4
        Lc2:
            o5.w r0 = o5.C3683w.f36547a
            android.content.Context r1 = r9.f31104a
            r0.m(r1, r10, r7, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.SearchApksWorker.a(java.io.File, int):boolean");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        boolean z8;
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        try {
            ArrayList o8 = new e().o(this.f31104a);
            C3674n a8 = C3674n.f36505t.a(this.f31104a);
            a8.a();
            ArrayList e02 = a8.e0();
            Iterator it = o8.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                File candidateToNotify = (File) it.next();
                Iterator it2 = e02.iterator();
                int i9 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        int i10 = i9 + 1;
                        if (n.s(candidateToNotify.getAbsolutePath(), (String) it2.next(), false)) {
                            z8 = true;
                            break;
                        }
                        i9 = i10;
                    } else {
                        i9 = -1;
                        z8 = false;
                        break;
                    }
                }
                if (z8) {
                    e02.remove(i9);
                } else if (i8 < 10) {
                    AbstractC3255y.h(candidateToNotify, "candidateToNotify");
                    if (a(candidateToNotify, i8)) {
                        a8.H0(candidateToNotify.getAbsolutePath());
                        i8++;
                    }
                }
            }
            Iterator it3 = e02.iterator();
            while (it3.hasNext()) {
                String knownButNotFound = (String) it3.next();
                AbstractC3255y.h(knownButNotFound, "knownButNotFound");
                a8.F(knownButNotFound);
            }
            a8.l();
            return success;
        } catch (Exception e8) {
            e8.printStackTrace();
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3255y.h(failure, "failure()");
            return failure;
        }
    }
}