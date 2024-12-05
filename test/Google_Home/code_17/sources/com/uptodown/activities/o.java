package com.uptodown.activities;

import P5.AbstractC1378t;
import a5.C1639f;
import a5.C1641h;
import a5.z;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.o;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o5.C3667g;
import o5.C3677q;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class o extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30325a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30326b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30327c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f30328d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30329e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30330f;

    /* renamed from: g, reason: collision with root package name */
    private int f30331g;

    /* renamed from: h, reason: collision with root package name */
    private int f30332h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C1639f f30333a;

        /* renamed from: b, reason: collision with root package name */
        private final C1641h f30334b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30335c;

        public a(C1639f c1639f, C1641h appInfo, boolean z8) {
            AbstractC3255y.i(appInfo, "appInfo");
            this.f30333a = c1639f;
            this.f30334b = appInfo;
            this.f30335c = z8;
        }

        public final C1639f a() {
            return this.f30333a;
        }

        public final C1641h b() {
            return this.f30334b;
        }

        public final boolean c() {
            return this.f30335c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f30333a, aVar.f30333a) && AbstractC3255y.d(this.f30334b, aVar.f30334b) && this.f30335c == aVar.f30335c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            C1639f c1639f = this.f30333a;
            int hashCode = (((c1639f == null ? 0 : c1639f.hashCode()) * 31) + this.f30334b.hashCode()) * 31;
            boolean z8 = this.f30335c;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "OldVersionsData(app=" + this.f30333a + ", appInfo=" + this.f30334b + ", isOldVersionsAvailable=" + this.f30335c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30337b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f30338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, o oVar, S5.d dVar) {
            super(2, dVar);
            this.f30337b = context;
            this.f30338c = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int m(a5.z zVar, a5.z zVar2) {
            if (zVar != null && zVar2 != null) {
                long l8 = zVar2.l() - zVar.l();
                if (l8 == 0 && zVar.a() != null && zVar2.a() != null) {
                    String a8 = zVar2.a();
                    AbstractC3255y.f(a8);
                    long parseLong = Long.parseLong(a8);
                    String a9 = zVar.a();
                    AbstractC3255y.f(a9);
                    l8 = parseLong - Long.parseLong(a9);
                }
                return (int) l8;
            }
            return 0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30337b, this.f30338c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            T5.b.e();
            if (this.f30336a == 0) {
                O5.t.b(obj);
                C3660F c3660f = new C3660F(this.f30337b);
                Object value = this.f30338c.d().getValue();
                AbstractC3255y.f(value);
                a5.I B02 = c3660f.B0(((C1641h) value).i(), 20, this.f30338c.h());
                if (!B02.b() && B02.d() != null) {
                    String d8 = B02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        C3667g c3667g = new C3667g();
                        Context context = this.f30337b;
                        C1641h c1641h = (C1641h) this.f30338c.d().getValue();
                        if (c1641h != null) {
                            str = c1641h.y0();
                        } else {
                            str = null;
                        }
                        C1639f z8 = c3667g.z(context, str);
                        z.b bVar = a5.z.f14361h;
                        String d9 = B02.d();
                        AbstractC3255y.f(d9);
                        ArrayList a8 = bVar.a(d9);
                        if (a8 == null || a8.size() <= 0) {
                            o6.w wVar = this.f30338c.f30325a;
                            Object value2 = this.f30338c.d().getValue();
                            AbstractC3255y.f(value2);
                            wVar.setValue(new AbstractC3685y.c(new a(z8, (C1641h) value2, false)));
                        } else {
                            AbstractC1378t.B(a8, new Comparator() { // from class: com.uptodown.activities.p
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int m8;
                                    m8 = o.b.m((a5.z) obj2, (a5.z) obj3);
                                    return m8;
                                }
                            });
                            Object value3 = this.f30338c.d().getValue();
                            AbstractC3255y.f(value3);
                            ((C1641h) value3).y1(a8);
                            o6.w wVar2 = this.f30338c.f30325a;
                            Object value4 = this.f30338c.d().getValue();
                            AbstractC3255y.f(value4);
                            wVar2.setValue(new AbstractC3685y.c(new a(z8, (C1641h) value4, true)));
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30339a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30341c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Context context, S5.d dVar) {
            super(2, dVar);
            this.f30341c = str;
            this.f30342d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30341c, this.f30342d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30339a == 0) {
                O5.t.b(obj);
                Object value = o.this.d().getValue();
                AbstractC3255y.f(value);
                if (((C1641h) value).y0() != null) {
                    Object value2 = o.this.d().getValue();
                    AbstractC3255y.f(value2);
                    if (j6.n.s(((C1641h) value2).y0(), this.f30341c, true) && (d8 = SettingsPreferences.f30353b.d(this.f30342d)) != null) {
                        File file = new File(new C3677q().f(this.f30342d), d8);
                        UptodownApp.a aVar = UptodownApp.f29058B;
                        Context context = this.f30342d;
                        Object value3 = o.this.d().getValue();
                        AbstractC3255y.f(value3);
                        aVar.Y(file, context, ((C1641h) value3).t0());
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public o() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30325a = a8;
        this.f30326b = a8;
        this.f30327c = AbstractC3700N.a(null);
        this.f30328d = AbstractC3700N.a(null);
    }

    public final void b(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, this, null), 2, null);
    }

    public final o6.w c() {
        return this.f30327c;
    }

    public final o6.w d() {
        return this.f30328d;
    }

    public final InterfaceC3698L e() {
        return this.f30326b;
    }

    public final boolean f() {
        return this.f30330f;
    }

    public final boolean g() {
        return this.f30329e;
    }

    public final int h() {
        return this.f30331g;
    }

    public final int i() {
        return this.f30332h;
    }

    public final void j(Context context, String packageName) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(packageName, context, null), 2, null);
    }

    public final void k(boolean z8) {
        this.f30330f = z8;
    }

    public final void l(boolean z8) {
        this.f30329e = z8;
    }

    public final void m(int i8) {
        this.f30331g = i8;
    }

    public final void n(int i8) {
        this.f30332h = i8;
    }
}
