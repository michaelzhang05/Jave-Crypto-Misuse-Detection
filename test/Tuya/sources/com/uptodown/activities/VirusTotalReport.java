package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.D0;
import X4.C1496f;
import X4.C1498h;
import X4.C1508s;
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
import com.uptodown.activities.K;
import com.uptodown.activities.VirusTotalReport;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3307A;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class VirusTotalReport extends AbstractActivityC2489a {

    /* renamed from: P, reason: collision with root package name */
    public static final a f29048P = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f29049N = L5.l.b(new b());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f29050O = new ViewModelLazy(U.b(K.class), new e(this), new d(this), new f(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
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
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29052a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ VirusTotalReport f29054a;

            a(VirusTotalReport virusTotalReport) {
                this.f29054a = virusTotalReport;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f29054a.g3().f10072j.f10185b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    if (((K.a) ((AbstractC3337y.c) abstractC3337y).a()).a() != null) {
                        this.f29054a.n3();
                        this.f29054a.o3();
                        this.f29054a.p3();
                    } else {
                        this.f29054a.g3().f10077o.setVisibility(8);
                        this.f29054a.g3().f10083u.setVisibility(0);
                        this.f29054a.g3().f10072j.f10185b.setVisibility(8);
                    }
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29052a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = VirusTotalReport.this.i3().e();
                a aVar = new a(VirusTotalReport.this);
                this.f29052a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f29055a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29055a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29056a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29056a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29057a = function0;
            this.f29058b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29057a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29058b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0 g3() {
        return (D0) this.f29049N.getValue();
    }

    private final void h3() {
        K i32 = i3();
        Object value = i3().c().getValue();
        AbstractC3159y.f(value);
        i32.b(this, ((C1498h) value).f0(), ((Number) i3().f().getValue()).longValue(), ((Boolean) i3().i().getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K i3() {
        return (K) this.f29050O.getValue();
    }

    private final void j3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            g3().f10078p.setNavigationIcon(drawable);
            g3().f10078p.setNavigationContentDescription(getString(R.string.back));
        }
        g3().f10078p.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.k4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.k3(VirusTotalReport.this, view);
            }
        });
        TextView textView = g3().f10061D;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        if (i3().c().getValue() != null) {
            Object value = i3().c().getValue();
            AbstractC3159y.f(value);
            String m02 = ((C1498h) value).m0();
            if (m02 != null && m02.length() != 0) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Object value2 = i3().c().getValue();
                AbstractC3159y.f(value2);
                h8.l(((C1498h) value2).m0()).n(UptodownApp.f28003B.f0(this)).i(g3().f10064b.f10055b);
            } else {
                g3().f10064b.f10055b.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_app_icon_placeholder));
            }
        } else if (i3().d().getValue() != null) {
            C3307A c3307a = C3307A.f34473a;
            Object value3 = i3().d().getValue();
            AbstractC3159y.f(value3);
            g3().f10064b.f10055b.setImageDrawable(c3307a.j(this, ((C1496f) value3).Q()));
        }
        g3().f10064b.f10056c.setTypeface(aVar.t());
        if (i3().c().getValue() != null) {
            TextView textView2 = g3().f10064b.f10056c;
            Object value4 = i3().c().getValue();
            AbstractC3159y.f(value4);
            textView2.setText(((C1498h) value4).s0());
        } else if (i3().d().getValue() != null) {
            TextView textView3 = g3().f10064b.f10056c;
            Object value5 = i3().d().getValue();
            AbstractC3159y.f(value5);
            textView3.setText(((C1496f) value5).I());
        }
        g3().f10064b.f10057d.setTypeface(aVar.u());
        CharSequence charSequence = (CharSequence) i3().g().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            g3().f10064b.f10057d.setText((CharSequence) i3().g().getValue());
        } else if (i3().c().getValue() != null) {
            TextView textView4 = g3().f10064b.f10057d;
            Object value6 = i3().c().getValue();
            AbstractC3159y.f(value6);
            textView4.setText(((C1498h) value6).g1());
        } else if (i3().d().getValue() != null) {
            TextView textView5 = g3().f10064b.f10057d;
            Object value7 = i3().d().getValue();
            AbstractC3159y.f(value7);
            textView5.setText(((C1496f) value7).h0());
        }
        g3().f10080r.setTypeface(aVar.u());
        g3().f10079q.setTypeface(aVar.t());
        g3().f10079q.setOnClickListener(new View.OnClickListener() { // from class: A4.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.l3(VirusTotalReport.this, view);
            }
        });
        g3().f10058A.setTypeface(aVar.u());
        g3().f10088z.setTypeface(aVar.t());
        g3().f10060C.setTypeface(aVar.u());
        g3().f10059B.setTypeface(aVar.t());
        g3().f10086x.setTypeface(aVar.u());
        g3().f10085w.setTypeface(aVar.u());
        g3().f10084v.setTypeface(aVar.u());
        g3().f10062E.setTypeface(aVar.u());
        g3().f10083u.setTypeface(aVar.u());
        g3().f10072j.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.m4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.m3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(VirusTotalReport this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(VirusTotalReport this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.i3().h().getValue() != null) {
            Object value = this$0.i3().h().getValue();
            AbstractC3159y.f(value);
            this$0.I2(((X4.H) value).j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3() {
        String str;
        String str2;
        X4.H h8 = (X4.H) i3().h().getValue();
        String str3 = null;
        if (h8 != null) {
            str = h8.j();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView = g3().f10058A;
            Object value = i3().h().getValue();
            AbstractC3159y.f(value);
            textView.setText(((X4.H) value).j());
        } else {
            g3().f10075m.setVisibility(8);
        }
        C1498h c1498h = (C1498h) i3().c().getValue();
        if (c1498h != null) {
            str2 = c1498h.q0();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            TextView textView2 = g3().f10060C;
            C1498h c1498h2 = (C1498h) i3().c().getValue();
            if (c1498h2 != null) {
                str3 = c1498h2.q0();
            }
            textView2.setText(str3);
        } else {
            TextView textView3 = g3().f10060C;
            C1496f c1496f = (C1496f) i3().d().getValue();
            if (c1496f != null) {
                str3 = c1496f.z();
            }
            textView3.setText(str3);
        }
        g3().f10072j.f10185b.setVisibility(8);
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
        AbstractC3159y.f(value);
        if (((X4.H) value).c() != null) {
            Object value2 = i3().h().getValue();
            AbstractC3159y.f(value2);
            ArrayList c8 = ((X4.H) value2).c();
            AbstractC3159y.f(c8);
            if (c8.size() > 0) {
                Object value3 = i3().h().getValue();
                AbstractC3159y.f(value3);
                ArrayList c9 = ((X4.H) value3).c();
                AbstractC3159y.f(c9);
                int size = c9.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View inflate = getLayoutInflater().inflate(R.layout.scan_positive, (ViewGroup) g3().f10071i, false);
                    AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    relativeLayout.setLayoutParams(layoutParams);
                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_antivirus_name);
                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_virus_name);
                    Object value4 = i3().h().getValue();
                    AbstractC3159y.f(value4);
                    ArrayList c10 = ((X4.H) value4).c();
                    AbstractC3159y.f(c10);
                    textView.setText(((C1508s) c10.get(i8)).c());
                    Object value5 = i3().h().getValue();
                    AbstractC3159y.f(value5);
                    ArrayList c11 = ((X4.H) value5).c();
                    AbstractC3159y.f(c11);
                    textView2.setText(((C1508s) c11.get(i8)).e());
                    g3().f10071i.addView(relativeLayout);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
                l6.v c8 = i3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable6 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable5 = (Parcelable) parcelable6;
                } else {
                    parcelable5 = extras.getParcelable("appInfo");
                }
                c8.setValue(parcelable5);
            }
            if (extras != null && extras.containsKey("app_selected")) {
                l6.v d8 = i3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("app_selected", C1496f.class);
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
                l6.v h8 = i3().h();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appReportVT", X4.H.class);
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
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
    }
}
