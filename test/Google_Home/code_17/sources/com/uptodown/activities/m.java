package com.uptodown.activities;

import P5.AbstractC1378t;
import Q4.w;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b5.ResultReceiverC1980e;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3655A;
import o5.C3674n;
import o5.C3677q;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30284a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30285b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30286c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f30287d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30288a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f30289b;

        public a(ArrayList downloads, ArrayList downloadsQueue) {
            AbstractC3255y.i(downloads, "downloads");
            AbstractC3255y.i(downloadsQueue, "downloadsQueue");
            this.f30288a = downloads;
            this.f30289b = downloadsQueue;
        }

        public final ArrayList a() {
            return this.f30288a;
        }

        public final ArrayList b() {
            return this.f30289b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f30288a, aVar.f30288a) && AbstractC3255y.d(this.f30289b, aVar.f30289b);
        }

        public int hashCode() {
            return (this.f30288a.hashCode() * 31) + this.f30289b.hashCode();
        }

        public String toString() {
            return "MyDownloadsData(downloads=" + this.f30288a + ", downloadsQueue=" + this.f30289b + ')';
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
        public static final /* synthetic */ int[] f30294a;

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
            f30294a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f30296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1648o c1648o, Context context, S5.d dVar) {
            super(2, dVar);
            this.f30296b = c1648o;
            this.f30297c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30296b, this.f30297c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30295a == 0) {
                O5.t.b(obj);
                DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
                if (aVar.d(this.f30296b.h(), this.f30296b.e0())) {
                    aVar.a(this.f30296b.h());
                }
                C3674n a8 = C3674n.f36505t.a(this.f30297c);
                a8.a();
                int A8 = a8.A(this.f30296b);
                a8.l();
                if (this.f30296b.g() != null) {
                    String g8 = this.f30296b.g();
                    AbstractC3255y.f(g8);
                    File file = new File(g8);
                    if (file.exists()) {
                        file.delete();
                    }
                } else if (this.f30296b.X() != null) {
                    File f8 = new C3677q().f(this.f30297c);
                    String X7 = this.f30296b.X();
                    AbstractC3255y.f(X7);
                    File file2 = new File(f8, X7);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
                boolean z8 = true;
                if (A8 == 1) {
                    ResultReceiverC1980e f9 = C3655A.f36474a.f();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("download", this.f30296b);
                    O5.I i8 = O5.I.f8278a;
                    f9.send(ComposerKt.reuseKey, bundle);
                }
                if (A8 != 1) {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f30300c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30301d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f30302e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f30303f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, m mVar, Context context, b bVar, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f30299b = z8;
            this.f30300c = mVar;
            this.f30301d = context;
            this.f30302e = bVar;
            this.f30303f = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f30299b, this.f30300c, this.f30301d, this.f30302e, this.f30303f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            File file;
            T5.b.e();
            if (this.f30298a == 0) {
                O5.t.b(obj);
                if (this.f30299b) {
                    this.f30300c.f30284a.setValue(AbstractC3685y.a.f36548a);
                }
                this.f30300c.g(this.f30301d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File f8 = new C3677q().f(this.f30301d);
                C3674n a8 = C3674n.f36505t.a(this.f30301d);
                a8.a();
                Iterator it = a8.c0().iterator();
                while (it.hasNext()) {
                    C1648o c1648o = (C1648o) it.next();
                    if (c1648o.h0()) {
                        if (c1648o.X() != null) {
                            String X7 = c1648o.X();
                            AbstractC3255y.f(X7);
                            File file2 = new File(f8, X7);
                            if (file2.exists()) {
                                c1648o.o0(file2.getAbsolutePath());
                            }
                        }
                        arrayList.add(c1648o);
                    } else {
                        if (c1648o.X() != null) {
                            String X8 = c1648o.X();
                            AbstractC3255y.f(X8);
                            file = new File(f8, X8);
                            if (!file.exists()) {
                                String X9 = c1648o.X();
                                AbstractC3255y.f(X9);
                                file = new File(externalStoragePublicDirectory, X9);
                            }
                        } else {
                            file = null;
                        }
                        if (file != null) {
                            if (!file.exists()) {
                                a8.A(c1648o);
                            } else {
                                c1648o.o0(file.getAbsolutePath());
                                c1648o.H(this.f30301d, file);
                                arrayList2.add(c1648o);
                            }
                        } else {
                            a8.A(c1648o);
                        }
                    }
                }
                a8.l();
                this.f30300c.m(arrayList2, this.f30302e, this.f30303f);
                this.f30300c.f30287d.setValue(arrayList);
                this.f30300c.f30286c.setValue(arrayList2);
                this.f30300c.f30284a.setValue(new AbstractC3685y.c(new a(arrayList2, arrayList)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30304a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30306c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f30307d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f30308e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, b bVar, boolean z8, S5.d dVar) {
            super(2, dVar);
            this.f30306c = str;
            this.f30307d = bVar;
            this.f30308e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f30306c, this.f30307d, this.f30308e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30304a == 0) {
                O5.t.b(obj);
                m mVar = m.this;
                ArrayList l8 = mVar.l((ArrayList) mVar.f30286c.getValue(), this.f30306c);
                m.this.m(l8, this.f30307d, this.f30308e);
                m mVar2 = m.this;
                m.this.f30284a.setValue(new AbstractC3685y.c(new a(l8, mVar2.l((ArrayList) mVar2.f30287d.getValue(), this.f30306c))));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            C1648o c1648o = (C1648o) obj;
            long j8 = 0;
            if (c1648o.g() == null) {
                lastModified = 0;
            } else {
                String g8 = c1648o.g();
                AbstractC3255y.f(g8);
                lastModified = new File(g8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            C1648o c1648o2 = (C1648o) obj2;
            if (c1648o2.g() != null) {
                String g9 = c1648o2.g();
                AbstractC3255y.f(g9);
                j8 = new File(g9).lastModified();
            }
            return R5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            C1648o c1648o = (C1648o) obj2;
            long j8 = 0;
            if (c1648o.g() == null) {
                lastModified = 0;
            } else {
                String g8 = c1648o.g();
                AbstractC3255y.f(g8);
                lastModified = new File(g8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            C1648o c1648o2 = (C1648o) obj;
            if (c1648o2.g() != null) {
                String g9 = c1648o2.g();
                AbstractC3255y.f(g9);
                j8 = new File(g9).lastModified();
            }
            return R5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(((C1648o) obj).X(), ((C1648o) obj2).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(((C1648o) obj2).X(), ((C1648o) obj).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(Long.valueOf(((C1648o) obj).a0()), Long.valueOf(((C1648o) obj2).a0()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(Long.valueOf(((C1648o) obj2).a0()), Long.valueOf(((C1648o) obj).a0()));
        }
    }

    public m() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30284a = a8;
        this.f30285b = a8;
        this.f30286c = AbstractC3700N.a(new ArrayList());
        this.f30287d = AbstractC3700N.a(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Context context) {
        PackageInfo packageInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList a8 = new C3677q().a(context);
        ArrayList d8 = new C3677q().d(context);
        d8.addAll(a8);
        PackageManager pm = context.getPackageManager();
        Iterator it = d8.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            AbstractC3255y.h(name, "file.name");
            boolean z8 = false;
            if (j6.n.r(name, ".apk", false, 2, null)) {
                String apkFilePath = file.getAbsolutePath();
                try {
                    AbstractC3255y.h(pm, "pm");
                    AbstractC3255y.h(apkFilePath, "apkFilePath");
                    packageInfo = Q4.q.c(pm, apkFilePath, 128);
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
                    C3677q c3677q = new C3677q();
                    AbstractC3255y.h(file, "file");
                    File b8 = c3677q.b(context, file);
                    if (b8 != null) {
                        arrayList.add(b8);
                    } else {
                        String name2 = file.getName();
                        AbstractC3255y.h(name2, "file.name");
                        if (!j6.n.C(name2, "split_config", false, 2, null)) {
                            arrayList.add(file);
                        }
                    }
                }
            } else {
                w.a aVar = Q4.w.f9241b;
                String name3 = file.getName();
                AbstractC3255y.h(name3, "file.name");
                if (aVar.a(name3)) {
                    C3677q c3677q2 = new C3677q();
                    AbstractC3255y.h(file, "file");
                    File b9 = c3677q2.b(context, file);
                    if (b9 != null) {
                        arrayList.add(b9);
                    } else {
                        arrayList.add(file);
                    }
                }
            }
        }
        C3674n a9 = C3674n.f36505t.a(context);
        a9.a();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file2 = (File) it2.next();
            String name4 = file2.getName();
            AbstractC3255y.h(name4, "file.name");
            if (a9.Y(name4) == null) {
                C1648o.b bVar = C1648o.f14294y;
                AbstractC3255y.h(file2, "file");
                C1648o a10 = bVar.a(context, file2);
                if (a10 != null) {
                    a9.F0(a10);
                }
            }
        }
        a9.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList l(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C1648o c1648o = (C1648o) obj;
            String X7 = c1648o.X();
            String str2 = "";
            boolean z8 = true;
            if (X7 != null && X7.length() != 0) {
                String X8 = c1648o.X();
                AbstractC3255y.f(X8);
                if (str != null) {
                    str2 = str;
                }
                z8 = j6.n.F(X8, str2, true);
            } else {
                String Y7 = c1648o.Y();
                if (Y7 != null && Y7.length() != 0) {
                    String Y8 = c1648o.Y();
                    AbstractC3255y.f(Y8);
                    if (str != null) {
                        str2 = str;
                    }
                    z8 = j6.n.F(Y8, str2, true);
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
        int i8 = c.f30294a[bVar.ordinal()];
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
                AbstractC1378t.B(arrayList, new h());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1378t.B(arrayList, new g());
        }
    }

    private final void o(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1378t.B(arrayList, new j());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1378t.B(arrayList, new i());
        }
    }

    private final void p(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1378t.B(arrayList, new l());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1378t.B(arrayList, new k());
        }
    }

    public final Object h(Context context, C1648o c1648o, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new d(c1648o, context, null), dVar);
    }

    public final void i(Context context, b sortType, boolean z8, boolean z9) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(sortType, "sortType");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(z9, this, context, sortType, z8, null), 2, null);
    }

    public final void j(String str, b sortType, boolean z8) {
        AbstractC3255y.i(sortType, "sortType");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new f(str, sortType, z8, null), 2, null);
    }

    public final InterfaceC3698L k() {
        return this.f30285b;
    }
}
