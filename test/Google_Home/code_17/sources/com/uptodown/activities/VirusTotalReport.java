package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.D0;
import a5.C1639f;
import a5.C1641h;
import a5.C1651s;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.J;
import com.uptodown.activities.VirusTotalReport;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3655A;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class VirusTotalReport extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    public static final a f30102P = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f30103N = O5.l.b(new b());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f30104O = new ViewModelLazy(U.b(J.class), new e(this), new d(this), new f(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D0 invoke() {
            return D0.c(VirusTotalReport.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30106a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ VirusTotalReport f30108a;

            a(VirusTotalReport virusTotalReport) {
                this.f30108a = virusTotalReport;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f30108a.g3().f11729j.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    if (((J.a) ((AbstractC3685y.c) abstractC3685y).a()).a() != null) {
                        this.f30108a.n3();
                        this.f30108a.o3();
                        this.f30108a.p3();
                    } else {
                        this.f30108a.g3().f11734o.setVisibility(8);
                        this.f30108a.g3().f11740u.setVisibility(0);
                        this.f30108a.g3().f11729j.f11842b.setVisibility(8);
                    }
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30106a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = VirusTotalReport.this.i3().e();
                a aVar = new a(VirusTotalReport.this);
                this.f30106a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30109a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30109a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f30110a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30110a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30111a = function0;
            this.f30112b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30111a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30112b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 g3() {
        return (D0) this.f30103N.getValue();
    }

    private final void h3() {
        J i32 = i3();
        Object value = i3().c().getValue();
        AbstractC3255y.f(value);
        i32.b(this, ((C1641h) value).f0(), ((Number) i3().f().getValue()).longValue(), ((Boolean) i3().i().getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J i3() {
        return (J) this.f30104O.getValue();
    }

    private final void j3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            g3().f11735p.setNavigationIcon(drawable);
            g3().f11735p.setNavigationContentDescription(getString(R.string.back));
        }
        g3().f11735p.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.k3(VirusTotalReport.this, view);
            }
        });
        TextView textView = g3().f11718D;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        if (i3().c().getValue() != null) {
            Object value = i3().c().getValue();
            AbstractC3255y.f(value);
            String m02 = ((C1641h) value).m0();
            if (m02 != null && m02.length() != 0) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Object value2 = i3().c().getValue();
                AbstractC3255y.f(value2);
                h8.l(((C1641h) value2).m0()).n(UptodownApp.f29058B.f0(this)).i(g3().f11721b.f11712b);
            } else {
                g3().f11721b.f11712b.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_app_icon_placeholder));
            }
        } else if (i3().d().getValue() != null) {
            C3655A c3655a = C3655A.f36474a;
            Object value3 = i3().d().getValue();
            AbstractC3255y.f(value3);
            g3().f11721b.f11712b.setImageDrawable(c3655a.j(this, ((C1639f) value3).J()));
        }
        g3().f11721b.f11713c.setTypeface(aVar.t());
        if (i3().c().getValue() != null) {
            TextView textView2 = g3().f11721b.f11713c;
            Object value4 = i3().c().getValue();
            AbstractC3255y.f(value4);
            textView2.setText(((C1641h) value4).s0());
        } else if (i3().d().getValue() != null) {
            TextView textView3 = g3().f11721b.f11713c;
            Object value5 = i3().d().getValue();
            AbstractC3255y.f(value5);
            textView3.setText(((C1639f) value5).z());
        }
        g3().f11721b.f11714d.setTypeface(aVar.u());
        CharSequence charSequence = (CharSequence) i3().g().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            g3().f11721b.f11714d.setText((CharSequence) i3().g().getValue());
        } else if (i3().c().getValue() != null) {
            TextView textView4 = g3().f11721b.f11714d;
            Object value6 = i3().c().getValue();
            AbstractC3255y.f(value6);
            textView4.setText(((C1641h) value6).g1());
        } else if (i3().d().getValue() != null) {
            TextView textView5 = g3().f11721b.f11714d;
            Object value7 = i3().d().getValue();
            AbstractC3255y.f(value7);
            textView5.setText(((C1639f) value7).h0());
        }
        g3().f11737r.setTypeface(aVar.u());
        g3().f11736q.setTypeface(aVar.t());
        g3().f11736q.setOnClickListener(new View.OnClickListener() { // from class: D4.m4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.l3(VirusTotalReport.this, view);
            }
        });
        g3().f11715A.setTypeface(aVar.u());
        g3().f11745z.setTypeface(aVar.t());
        g3().f11717C.setTypeface(aVar.u());
        g3().f11716B.setTypeface(aVar.t());
        g3().f11743x.setTypeface(aVar.u());
        g3().f11742w.setTypeface(aVar.u());
        g3().f11741v.setTypeface(aVar.u());
        g3().f11719E.setTypeface(aVar.u());
        g3().f11740u.setTypeface(aVar.u());
        g3().f11729j.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.m3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(VirusTotalReport this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(VirusTotalReport this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.i3().h().getValue() != null) {
            Object value = this$0.i3().h().getValue();
            AbstractC3255y.f(value);
            this$0.I2(((a5.H) value).l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3() {
        String str;
        String str2;
        a5.H h8 = (a5.H) i3().h().getValue();
        String str3 = null;
        if (h8 != null) {
            str = h8.l();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView = g3().f11715A;
            Object value = i3().h().getValue();
            AbstractC3255y.f(value);
            textView.setText(((a5.H) value).l());
        } else {
            g3().f11732m.setVisibility(8);
        }
        C1641h c1641h = (C1641h) i3().c().getValue();
        if (c1641h != null) {
            str2 = c1641h.q0();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            TextView textView2 = g3().f11717C;
            C1641h c1641h2 = (C1641h) i3().c().getValue();
            if (c1641h2 != null) {
                str3 = c1641h2.q0();
            }
            textView2.setText(str3);
        } else {
            TextView textView3 = g3().f11717C;
            C1639f c1639f = (C1639f) i3().d().getValue();
            if (c1639f != null) {
                str3 = c1639f.x();
            }
            textView3.setText(str3);
        }
        g3().f11729j.f11842b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x017e, code lost:
    
        if (r1.size() > 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o3() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.VirusTotalReport.o3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.margin_s), 0, 0);
        Object value = i3().h().getValue();
        AbstractC3255y.f(value);
        if (((a5.H) value).b() != null) {
            Object value2 = i3().h().getValue();
            AbstractC3255y.f(value2);
            ArrayList b8 = ((a5.H) value2).b();
            AbstractC3255y.f(b8);
            if (b8.size() > 0) {
                Object value3 = i3().h().getValue();
                AbstractC3255y.f(value3);
                ArrayList b9 = ((a5.H) value3).b();
                AbstractC3255y.f(b9);
                int size = b9.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View inflate = getLayoutInflater().inflate(R.layout.scan_positive, (ViewGroup) g3().f11728i, false);
                    AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    relativeLayout.setLayoutParams(layoutParams);
                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_antivirus_name);
                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_virus_name);
                    Object value4 = i3().h().getValue();
                    AbstractC3255y.f(value4);
                    ArrayList b10 = ((a5.H) value4).b();
                    AbstractC3255y.f(b10);
                    textView.setText(((C1651s) b10.get(i8)).b());
                    Object value5 = i3().h().getValue();
                    AbstractC3255y.f(value5);
                    ArrayList b11 = ((a5.H) value5).b();
                    AbstractC3255y.f(b11);
                    textView2.setText(((C1651s) b11.get(i8)).g());
                    g3().f11728i.addView(relativeLayout);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Parcelable parcelable5;
        Object parcelable6;
        super.onCreate(bundle);
        setContentView(g3().getRoot());
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appInfo")) {
                o6.w c8 = i3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable6 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable5 = (Parcelable) parcelable6;
                } else {
                    parcelable5 = extras.getParcelable("appInfo");
                }
                c8.setValue(parcelable5);
            }
            if (extras != null && extras.containsKey("app_selected")) {
                o6.w d8 = i3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("app_selected", C1639f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable("app_selected");
                }
                d8.setValue(parcelable3);
            }
            if (extras != null && extras.containsKey("old_version")) {
                i3().g().setValue(extras.getString("old_version"));
            }
            if (extras != null && extras.containsKey("oldVersionId")) {
                i3().i().setValue(Boolean.TRUE);
                i3().f().setValue(Long.valueOf(extras.getLong("oldVersionId")));
            }
            if (extras != null && extras.containsKey("appReportVT")) {
                o6.w h8 = i3().h();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appReportVT", a5.H.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appReportVT");
                }
                h8.setValue(parcelable);
            }
        }
        j3();
        if (i3().h().getValue() != null) {
            o3();
            p3();
            n3();
        } else {
            h3();
        }
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
    }
}
