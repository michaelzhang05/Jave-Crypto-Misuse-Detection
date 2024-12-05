package com.uptodown.activities;

import M5.AbstractC1246t;
import N4.w;
import X4.C1505o;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.workers.DownloadApkWorker;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3307A;
import l5.C3326n;
import l5.C3329q;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class n extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29254a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29255b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29256c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f29257d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29258a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29259b;

        public a(ArrayList downloads, ArrayList downloadsQueue) {
            AbstractC3159y.i(downloads, "downloads");
            AbstractC3159y.i(downloadsQueue, "downloadsQueue");
            this.f29258a = downloads;
            this.f29259b = downloadsQueue;
        }

        public final ArrayList a() {
            return this.f29258a;
        }

        public final ArrayList b() {
            return this.f29259b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f29258a, aVar.f29258a) && AbstractC3159y.d(this.f29259b, aVar.f29259b);
        }

        public int hashCode() {
            return (this.f29258a.hashCode() * 31) + this.f29259b.hashCode();
        }

        public String toString() {
            return "MyDownloadsData(downloads=" + this.f29258a + ", downloadsQueue=" + this.f29259b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public enum b {
        NAME,
        DATE,
        SIZE
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29264a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29264a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f29266b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1505o c1505o, Context context, P5.d dVar) {
            super(2, dVar);
            this.f29266b = c1505o;
            this.f29267c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29266b, this.f29267c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29265a == 0) {
                L5.t.b(obj);
                DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
                if (aVar.d(this.f29266b.f(), this.f29266b.e0())) {
                    aVar.a(this.f29266b.f());
                }
                C3326n a8 = C3326n.f34504t.a(this.f29267c);
                a8.a();
                int x8 = a8.x(this.f29266b);
                a8.g();
                if (this.f29266b.e() != null) {
                    String e8 = this.f29266b.e();
                    AbstractC3159y.f(e8);
                    File file = new File(e8);
                    if (file.exists()) {
                        file.delete();
                    }
                } else if (this.f29266b.X() != null) {
                    File f8 = new C3329q().f(this.f29267c);
                    String X7 = this.f29266b.X();
                    AbstractC3159y.f(X7);
                    File file2 = new File(f8, X7);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
                boolean z8 = true;
                if (x8 == 1) {
                    Y4.e f9 = C3307A.f34473a.f();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("download", this.f29266b);
                    L5.I i8 = L5.I.f6487a;
                    f9.send(ComposerKt.reuseKey, bundle);
                }
                if (x8 != 1) {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f29270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f29271d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f29272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f29273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, n nVar, Context context, b bVar, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f29269b = z8;
            this.f29270c = nVar;
            this.f29271d = context;
            this.f29272e = bVar;
            this.f29273f = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29269b, this.f29270c, this.f29271d, this.f29272e, this.f29273f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            File file;
            Q5.b.e();
            if (this.f29268a == 0) {
                L5.t.b(obj);
                if (this.f29269b) {
                    this.f29270c.f29254a.setValue(AbstractC3337y.a.f34547a);
                }
                this.f29270c.g(this.f29271d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File f8 = new C3329q().f(this.f29271d);
                C3326n a8 = C3326n.f34504t.a(this.f29271d);
                a8.a();
                Iterator it = a8.c0().iterator();
                while (it.hasNext()) {
                    C1505o c1505o = (C1505o) it.next();
                    if (c1505o.h0()) {
                        if (c1505o.X() != null) {
                            String X7 = c1505o.X();
                            AbstractC3159y.f(X7);
                            File file2 = new File(f8, X7);
                            if (file2.exists()) {
                                c1505o.o0(file2.getAbsolutePath());
                            }
                        }
                        arrayList.add(c1505o);
                    } else {
                        if (c1505o.X() != null) {
                            String X8 = c1505o.X();
                            AbstractC3159y.f(X8);
                            file = new File(f8, X8);
                            if (!file.exists()) {
                                String X9 = c1505o.X();
                                AbstractC3159y.f(X9);
                                file = new File(externalStoragePublicDirectory, X9);
                            }
                        } else {
                            file = null;
                        }
                        if (file != null) {
                            if (!file.exists()) {
                                a8.x(c1505o);
                            } else {
                                c1505o.o0(file.getAbsolutePath());
                                c1505o.L(this.f29271d, file);
                                arrayList2.add(c1505o);
                            }
                        } else {
                            a8.x(c1505o);
                        }
                    }
                }
                a8.g();
                this.f29270c.m(arrayList2, this.f29272e, this.f29273f);
                this.f29270c.f29257d.setValue(arrayList);
                this.f29270c.f29256c.setValue(arrayList2);
                this.f29270c.f29254a.setValue(new AbstractC3337y.c(new a(arrayList2, arrayList)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29274a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29276c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f29277d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f29278e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, b bVar, boolean z8, P5.d dVar) {
            super(2, dVar);
            this.f29276c = str;
            this.f29277d = bVar;
            this.f29278e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f29276c, this.f29277d, this.f29278e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29274a == 0) {
                L5.t.b(obj);
                n nVar = n.this;
                ArrayList l8 = nVar.l((ArrayList) nVar.f29256c.getValue(), this.f29276c);
                n.this.m(l8, this.f29277d, this.f29278e);
                n nVar2 = n.this;
                n.this.f29254a.setValue(new AbstractC3337y.c(new a(l8, nVar2.l((ArrayList) nVar2.f29257d.getValue(), this.f29276c))));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            C1505o c1505o = (C1505o) obj;
            long j8 = 0;
            if (c1505o.e() == null) {
                lastModified = 0;
            } else {
                String e8 = c1505o.e();
                AbstractC3159y.f(e8);
                lastModified = new File(e8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            C1505o c1505o2 = (C1505o) obj2;
            if (c1505o2.e() != null) {
                String e9 = c1505o2.e();
                AbstractC3159y.f(e9);
                j8 = new File(e9).lastModified();
            }
            return O5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            C1505o c1505o = (C1505o) obj2;
            long j8 = 0;
            if (c1505o.e() == null) {
                lastModified = 0;
            } else {
                String e8 = c1505o.e();
                AbstractC3159y.f(e8);
                lastModified = new File(e8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            C1505o c1505o2 = (C1505o) obj;
            if (c1505o2.e() != null) {
                String e9 = c1505o2.e();
                AbstractC3159y.f(e9);
                j8 = new File(e9).lastModified();
            }
            return O5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(((C1505o) obj).X(), ((C1505o) obj2).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(((C1505o) obj2).X(), ((C1505o) obj).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(Long.valueOf(((C1505o) obj).a0()), Long.valueOf(((C1505o) obj2).a0()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(Long.valueOf(((C1505o) obj2).a0()), Long.valueOf(((C1505o) obj).a0()));
        }
    }

    public n() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f29254a = a8;
        this.f29255b = a8;
        this.f29256c = AbstractC3351M.a(new ArrayList());
        this.f29257d = AbstractC3351M.a(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Context context) {
        PackageInfo packageInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList a8 = new C3329q().a(context);
        ArrayList d8 = new C3329q().d(context);
        d8.addAll(a8);
        PackageManager pm = context.getPackageManager();
        Iterator it = d8.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            boolean z8 = false;
            if (g6.n.r(name, ".apk", false, 2, null)) {
                String apkFilePath = file.getAbsolutePath();
                try {
                    AbstractC3159y.h(pm, "pm");
                    AbstractC3159y.h(apkFilePath, "apkFilePath");
                    packageInfo = N4.q.c(pm, apkFilePath, 128);
                } catch (Exception unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    try {
                        Bundle bundle = packageInfo.applicationInfo.metaData;
                        if (bundle != null && bundle.containsKey("com.android.vending.splits.required")) {
                            z8 = packageInfo.applicationInfo.metaData.getBoolean("com.android.vending.splits.required");
                        }
                    } catch (Exception unused2) {
                    }
                    if (!z8) {
                        arrayList.add(file);
                    }
                } else {
                    C3329q c3329q = new C3329q();
                    AbstractC3159y.h(file, "file");
                    File b8 = c3329q.b(context, file);
                    if (b8 != null) {
                        arrayList.add(b8);
                    } else {
                        String name2 = file.getName();
                        AbstractC3159y.h(name2, "file.name");
                        if (!g6.n.C(name2, "split_config", false, 2, null)) {
                            arrayList.add(file);
                        }
                    }
                }
            } else {
                w.a aVar = N4.w.f7281b;
                String name3 = file.getName();
                AbstractC3159y.h(name3, "file.name");
                if (aVar.a(name3)) {
                    C3329q c3329q2 = new C3329q();
                    AbstractC3159y.h(file, "file");
                    File b9 = c3329q2.b(context, file);
                    if (b9 != null) {
                        arrayList.add(b9);
                    } else {
                        arrayList.add(file);
                    }
                }
            }
        }
        C3326n a9 = C3326n.f34504t.a(context);
        a9.a();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file2 = (File) it2.next();
            String name4 = file2.getName();
            AbstractC3159y.h(name4, "file.name");
            if (a9.Y(name4) == null) {
                C1505o.b bVar = C1505o.f12673y;
                AbstractC3159y.h(file2, "file");
                C1505o a10 = bVar.a(context, file2);
                if (a10 != null) {
                    a9.F0(a10);
                }
            }
        }
        a9.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList l(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C1505o c1505o = (C1505o) obj;
            String X7 = c1505o.X();
            String str2 = "";
            boolean z8 = true;
            if (X7 != null && X7.length() != 0) {
                String X8 = c1505o.X();
                AbstractC3159y.f(X8);
                if (str != null) {
                    str2 = str;
                }
                z8 = g6.n.F(X8, str2, true);
            } else {
                String Y7 = c1505o.Y();
                if (Y7 != null && Y7.length() != 0) {
                    String Y8 = c1505o.Y();
                    AbstractC3159y.f(Y8);
                    if (str != null) {
                        str2 = str;
                    }
                    z8 = g6.n.F(Y8, str2, true);
                }
            }
            if (z8) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ArrayList arrayList, b bVar, boolean z8) {
        int i8 = c.f29264a[bVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    o(arrayList, z8);
                    return;
                }
                return;
            }
            p(arrayList, z8);
            return;
        }
        n(arrayList, z8);
    }

    private final void n(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1246t.B(arrayList, new h());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1246t.B(arrayList, new g());
        }
    }

    private final void o(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1246t.B(arrayList, new j());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1246t.B(arrayList, new i());
        }
    }

    private final void p(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1246t.B(arrayList, new l());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1246t.B(arrayList, new k());
        }
    }

    public final Object h(Context context, C1505o c1505o, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new d(c1505o, context, null), dVar);
    }

    public final void i(Context context, b sortType, boolean z8, boolean z9) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(sortType, "sortType");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(z9, this, context, sortType, z8, null), 2, null);
    }

    public final void j(String str, b sortType, boolean z8) {
        AbstractC3159y.i(sortType, "sortType");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new f(str, sortType, z8, null), 2, null);
    }

    public final InterfaceC3349K k() {
        return this.f29255b;
    }
}
