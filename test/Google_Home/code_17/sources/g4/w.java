package G4;

import G4.w;
import P5.AbstractC1378t;
import W4.W;
import W4.X;
import W4.Y;
import Z4.InterfaceC1590d;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import r5.AbstractC3938h;
import r5.C3953o0;
import r5.C3970x0;

/* loaded from: classes4.dex */
public final class w extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3340e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1590d f3341a;

    /* renamed from: b, reason: collision with root package name */
    private String f3342b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f3343c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3344d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f3345a;

        /* renamed from: b, reason: collision with root package name */
        private int f3346b;

        public final Object a() {
            Object obj = this.f3345a;
            if (obj != null) {
                return obj;
            }
            AbstractC3255y.y("item");
            return O5.I.f8278a;
        }

        public final int b() {
            return this.f3346b;
        }

        public final void c(Object obj) {
            AbstractC3255y.i(obj, "<set-?>");
            this.f3345a = obj;
        }

        public final void d(int i8) {
            this.f3346b = i8;
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1590d f3347a;

        /* renamed from: b, reason: collision with root package name */
        private Context f3348b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f3349c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f3350d;

        /* loaded from: classes4.dex */
        public final class a extends AbstractC3938h {

            /* renamed from: b, reason: collision with root package name */
            private final W4.E f3351b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1590d f3352c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f3353d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(G4.w.c r2, W4.E r3, Z4.InterfaceC1590d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                    r1.f3353d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "binding.root"
                    kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f3351b = r3
                    r1.f3352c = r4
                    android.widget.TextView r2 = r3.f11755j
                    H4.j$a r4 = H4.j.f3824g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f11753h
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f11758m
                    android.graphics.Typeface r3 = r4.u()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: G4.w.c.a.<init>(G4.w$c, W4.E, Z4.d, android.content.Context):void");
            }

            public final void l(C1641h app, boolean z8) {
                AbstractC3255y.i(app, "app");
                int dimension = (int) this.f3353d.f3348b.getResources().getDimension(R.dimen.margin_m);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (z8) {
                    layoutParams.setMargins(dimension, 0, dimension, dimension);
                } else {
                    layoutParams.setMargins(dimension, 0, 0, dimension);
                }
                this.itemView.setLayoutParams(layoutParams);
                String e02 = app.e0();
                if (e02 != null && e02.length() != 0) {
                    com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f29058B.e0(this.f3353d.f3348b)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3351b.f11747b);
                }
                View itemView = this.itemView;
                AbstractC3255y.h(itemView, "itemView");
                c(itemView, this.f3352c, app);
                TextView textView = this.f3351b.f11755j;
                AbstractC3255y.h(textView, "binding.tvNameHomeCardFeaturedItem");
                TextView textView2 = this.f3351b.f11753h;
                AbstractC3255y.h(textView2, "binding.tvDescHomeCardFeaturedItem");
                i(app, textView, textView2);
                String y02 = app.y0();
                TextView textView3 = this.f3351b.f11758m;
                AbstractC3255y.h(textView3, "binding.tvStatusHomeCardFeaturedItem");
                TextView textView4 = this.f3351b.f11753h;
                AbstractC3255y.h(textView4, "binding.tvDescHomeCardFeaturedItem");
                g(y02, textView3, textView4);
                ImageView imageView = this.f3351b.f11748c;
                AbstractC3255y.h(imageView, "binding.ivLogoHomeCardFeaturedItem");
                h(imageView, app.m0());
            }
        }

        public c(w wVar, InterfaceC1590d listener, Context context) {
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3350d = wVar;
            this.f3347a = listener;
            this.f3348b = context;
            this.f3349c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f3349c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3255y.i(holder, "holder");
            if (AbstractC3255y.d(this.f3349c.get(i8), AbstractC1378t.y0(this.f3349c))) {
                Object obj = this.f3349c.get(i8);
                AbstractC3255y.h(obj, "carouselApps[position]");
                holder.l((C1641h) obj, true);
            } else {
                Object obj2 = this.f3349c.get(i8);
                AbstractC3255y.h(obj2, "carouselApps[position]");
                holder.l((C1641h) obj2, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3255y.i(parent, "parent");
            W4.E c8 = W4.E.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3255y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
            return new a(this, c8, this.f3347a, this.f3348b);
        }

        public final void e(ArrayList carouselApps) {
            AbstractC3255y.i(carouselApps, "carouselApps");
            this.f3349c = carouselApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f3349c.size();
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private final c f3354b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f3355c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(G4.w r4, W4.V r5, Z4.InterfaceC1590d r6, android.content.Context r7, java.lang.String r8) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3255y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3255y.i(r7, r0)
                java.lang.String r0 = "organizationName"
                kotlin.jvm.internal.AbstractC3255y.i(r8, r0)
                r3.f3355c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                r3.<init>(r0, r7)
                G4.w$c r0 = new G4.w$c
                r0.<init>(r4, r6, r7)
                r3.f3354b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12006b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r1 = r3.itemView
                android.content.Context r1 = r1.getContext()
                r2 = 0
                r6.<init>(r1, r2, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12006b
                r4.setAdapter(r0)
                android.widget.TextView r4 = r5.f12007c
                H4.j$a r6 = H4.j.f3824g
                android.graphics.Typeface r6 = r6.t()
                r4.setTypeface(r6)
                android.widget.TextView r4 = r5.f12007c
                r5 = 2131952407(0x7f130317, float:1.9541256E38)
                r6 = 1
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r2] = r8
                java.lang.String r5 = r7.getString(r5, r6)
                r4.setText(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G4.w.d.<init>(G4.w, W4.V, Z4.d, android.content.Context, java.lang.String):void");
        }

        public final void l(ArrayList carouselApps) {
            AbstractC3255y.i(carouselApps, "carouselApps");
            this.f3354b.e(carouselApps);
        }

        public final c m() {
            return this.f3354b;
        }
    }

    /* loaded from: classes4.dex */
    public final class e extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private final W f3356b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1590d f3357c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3358d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f3359e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(G4.w r2, W4.W r3, Z4.InterfaceC1590d r4, android.content.Context r5) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                r1.f3359e = r2
                android.widget.RelativeLayout r2 = r3.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
                r1.<init>(r2, r5)
                r1.f3356b = r3
                r1.f3357c = r4
                r1.f3358d = r5
                android.widget.TextView r2 = r3.f12021n
                H4.j$a r4 = H4.j.f3824g
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12019l
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12016i
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12020m
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12022o
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12018k
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12017j
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12015h
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12023p
                android.graphics.Typeface r3 = r4.u()
                r2.setTypeface(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G4.w.e.<init>(G4.w, W4.W, Z4.d, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(e this$0, C1641h app, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(app, "$app");
            this$0.f3357c.b(app);
        }

        public final void m(final C1641h app) {
            AbstractC3255y.i(app, "app");
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.e0()).n(UptodownApp.f29058B.e0(this.f3358d)).i(this.f3356b.f12009b);
            } else {
                this.f3356b.f12009b.setImageDrawable(ContextCompat.getDrawable(this.f3358d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3255y.h(itemView, "itemView");
            c(itemView, this.f3357c, app);
            TextView textView = this.f3356b.f12019l;
            AbstractC3255y.h(textView, "binding.tvTopAppNameOrganization");
            TextView textView2 = this.f3356b.f12016i;
            AbstractC3255y.h(textView2, "binding.tvTopAppDescOrganization");
            i(app, textView, textView2);
            this.f3356b.f12022o.setText(String.valueOf(app.F0() / 10.0d));
            this.f3356b.f12018k.setText(this.f3358d.getString(R.string.downloads_counter_multiple, new Q4.g().b(app.J())));
            ImageView imageView = this.f3356b.f12010c;
            AbstractC3255y.h(imageView, "binding.ivTopAppLogoOrganization");
            h(imageView, app.m0());
            if (!new C3667g().r(app.y0(), this.f3358d)) {
                this.f3356b.f12017j.setOnClickListener(new View.OnClickListener() { // from class: G4.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        w.e.n(w.e.this, app, view);
                    }
                });
            } else {
                this.f3356b.f12017j.setVisibility(8);
            }
            ProgressBar progressBar = this.f3356b.f12013f;
            AbstractC3255y.h(progressBar, "binding.pbProgressLogoOrganization");
            ImageView imageView2 = this.f3356b.f12010c;
            AbstractC3255y.h(imageView2, "binding.ivTopAppLogoOrganization");
            TextView textView3 = this.f3356b.f12016i;
            AbstractC3255y.h(textView3, "binding.tvTopAppDescOrganization");
            TextView textView4 = this.f3356b.f12015h;
            AbstractC3255y.h(textView4, "binding.tvProgressTopOrganization");
            W w8 = this.f3356b;
            TextView textView5 = w8.f12020m;
            LinearLayout linearLayout = w8.f12011d;
            AbstractC3255y.h(linearLayout, "binding.llProgressTopOrganization");
            e(app, progressBar, imageView2, textView3, textView4, textView5, linearLayout);
        }
    }

    /* loaded from: classes4.dex */
    public final class f extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1590d f3360a;

        /* renamed from: b, reason: collision with root package name */
        private Context f3361b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f3362c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f3363d;

        /* loaded from: classes4.dex */
        public final class a extends AbstractC3938h {

            /* renamed from: b, reason: collision with root package name */
            private final Y f3364b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1590d f3365c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f3366d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(G4.w.f r2, W4.Y r3, Z4.InterfaceC1590d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                    r1.f3366d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "binding.root"
                    kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f3364b = r3
                    r1.f3365c = r4
                    android.widget.TextView r2 = r3.f12031f
                    H4.j$a r4 = H4.j.f3824g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12029d
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12032g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12033h
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12030e
                    android.graphics.Typeface r3 = r4.u()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: G4.w.f.a.<init>(G4.w$f, W4.Y, Z4.d, android.content.Context):void");
            }

            public final void l(C1641h app) {
                AbstractC3255y.i(app, "app");
                View itemView = this.itemView;
                AbstractC3255y.h(itemView, "itemView");
                c(itemView, this.f3365c, app);
                TextView textView = this.f3364b.f12031f;
                AbstractC3255y.h(textView, "binding.tvTopAppNameOrganization");
                TextView textView2 = this.f3364b.f12029d;
                AbstractC3255y.h(textView2, "binding.tvTopAppDescOrganization");
                i(app, textView, textView2);
                String y02 = app.y0();
                TextView textView3 = this.f3364b.f12032g;
                AbstractC3255y.h(textView3, "binding.tvTopAppStatusOrganization");
                TextView textView4 = this.f3364b.f12029d;
                AbstractC3255y.h(textView4, "binding.tvTopAppDescOrganization");
                g(y02, textView3, textView4);
                ImageView imageView = this.f3364b.f12027b;
                AbstractC3255y.h(imageView, "binding.ivTopAppLogoOrganization");
                h(imageView, app.m0());
                this.f3364b.f12033h.setText(String.valueOf(app.F0() / 10.0d));
                this.f3364b.f12030e.setText(this.f3366d.f3361b.getString(R.string.downloads_counter_multiple, new Q4.g().b(app.J())));
            }
        }

        public f(w wVar, InterfaceC1590d listener, Context context) {
            AbstractC3255y.i(listener, "listener");
            AbstractC3255y.i(context, "context");
            this.f3363d = wVar;
            this.f3360a = listener;
            this.f3361b = context;
            this.f3362c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f3362c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3255y.i(holder, "holder");
            Object obj = this.f3362c.get(i8);
            AbstractC3255y.h(obj, "importantApps[position]");
            holder.l((C1641h) obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3255y.i(parent, "parent");
            Y c8 = Y.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3255y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
            return new a(this, c8, this.f3360a, this.f3361b);
        }

        public final void e(ArrayList importantApps) {
            AbstractC3255y.i(importantApps, "importantApps");
            this.f3362c = importantApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f3362c.size();
        }
    }

    /* loaded from: classes4.dex */
    public final class g extends AbstractC3938h {

        /* renamed from: b, reason: collision with root package name */
        private final f f3367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f3368c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(G4.w r4, W4.X r5, Z4.InterfaceC1590d r6, android.content.Context r7) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3255y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3255y.i(r7, r0)
                r3.f3368c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                r3.<init>(r0, r7)
                G4.w$f r0 = new G4.w$f
                r0.<init>(r4, r6, r7)
                r3.f3367b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12025b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r7 = r3.itemView
                android.content.Context r7 = r7.getContext()
                r1 = 1
                r2 = 0
                r6.<init>(r7, r1, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12025b
                r4.setAdapter(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G4.w.g.<init>(G4.w, W4.X, Z4.d, android.content.Context):void");
        }

        public final void l(ArrayList importantApps) {
            AbstractC3255y.i(importantApps, "importantApps");
            this.f3367b.e(importantApps);
        }

        public final f m() {
            return this.f3367b;
        }
    }

    public w(InterfaceC1590d listener, String organizationName) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(organizationName, "organizationName");
        this.f3341a = listener;
        this.f3342b = organizationName;
        this.f3343c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f3343c.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1641h app = (C1641h) it.next();
                b bVar = new b();
                AbstractC3255y.h(app, "app");
                bVar.c(app);
                bVar.d(5);
                this.f3343c.add(bVar);
                notifyItemInserted(AbstractC1378t.o(this.f3343c));
            }
        }
    }

    public final void b(C1641h c1641h, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f3343c = new ArrayList();
        if (c1641h != null) {
            b bVar = new b();
            bVar.c(c1641h);
            bVar.d(1);
            this.f3343c.add(bVar);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            b bVar2 = new b();
            bVar2.c(arrayList);
            bVar2.d(2);
            this.f3343c.add(bVar2);
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            b bVar3 = new b();
            bVar3.c(arrayList2);
            bVar3.d(3);
            this.f3343c.add(bVar3);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            b bVar4 = new b();
            bVar4.c(arrayList3);
            bVar4.d(4);
            this.f3343c.add(bVar4);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C1641h app = (C1641h) it.next();
                b bVar5 = new b();
                AbstractC3255y.h(app, "app");
                bVar5.c(app);
                bVar5.d(5);
                this.f3343c.add(bVar5);
            }
        }
    }

    public final void c(boolean z8) {
        this.f3344d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(String packageName, RecyclerView recyclerView) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            if (findViewHolderForAdapterPosition instanceof e) {
                Iterator it = this.f3343c.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    int i10 = i9 + 1;
                    if (((b) it.next()).a() instanceof C1641h) {
                        notifyItemChanged(i9);
                    }
                    i9 = i10;
                }
            } else {
                Object obj = null;
                if (findViewHolderForAdapterPosition instanceof g) {
                    g gVar = (g) findViewHolderForAdapterPosition;
                    Iterator it2 = gVar.m().b().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (AbstractC3255y.d(((C1641h) next).y0(), packageName)) {
                            obj = next;
                            break;
                        }
                    }
                    gVar.m().notifyItemChanged(AbstractC1378t.r0(gVar.m().b(), (C1641h) obj));
                } else if (findViewHolderForAdapterPosition instanceof d) {
                    d dVar = (d) findViewHolderForAdapterPosition;
                    Iterator it3 = dVar.m().b().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (AbstractC3255y.d(((C1641h) next2).y0(), packageName)) {
                            obj = next2;
                            break;
                        }
                    }
                    dVar.m().notifyItemChanged(AbstractC1378t.r0(dVar.m().b(), (C1641h) obj));
                } else if (findViewHolderForAdapterPosition instanceof C3970x0) {
                    notifyItemChanged(i8);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3343c.size() + (this.f3344d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3343c.size()) {
            return 6;
        }
        return ((b) this.f3343c.get(i8)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        if (holder instanceof e) {
            Object a8 = ((b) this.f3343c.get(i8)).a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((e) holder).m((C1641h) a8);
            return;
        }
        if (holder instanceof g) {
            Object a9 = ((b) this.f3343c.get(i8)).a();
            AbstractC3255y.g(a9, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.AppInfo> }");
            ((g) holder).l((ArrayList) a9);
        } else if (holder instanceof d) {
            Object a10 = ((b) this.f3343c.get(i8)).a();
            AbstractC3255y.g(a10, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.AppInfo> }");
            ((d) holder).l((ArrayList) a10);
        } else if (holder instanceof C3970x0) {
            Object a11 = ((b) this.f3343c.get(i8)).a();
            AbstractC3255y.g(a11, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((C3970x0) holder).m((C1641h) a11, i8);
        } else if (holder instanceof C3953o0) {
            ((C3953o0) holder).b(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        switch (i8) {
            case 1:
                W c8 = W.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3255y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1590d interfaceC1590d = this.f3341a;
                Context context = parent.getContext();
                AbstractC3255y.h(context, "parent.context");
                return new e(this, c8, interfaceC1590d, context);
            case 2:
                X c9 = X.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3255y.h(c9, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1590d interfaceC1590d2 = this.f3341a;
                Context context2 = parent.getContext();
                AbstractC3255y.h(context2, "parent.context");
                return new g(this, c9, interfaceC1590d2, context2);
            case 3:
                W4.V c10 = W4.V.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3255y.h(c10, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1590d interfaceC1590d3 = this.f3341a;
                Context context3 = parent.getContext();
                AbstractC3255y.h(context3, "parent.context");
                return new d(this, c10, interfaceC1590d3, context3, this.f3342b);
            case 4:
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.title_organization_apps, parent, false);
                AbstractC3255y.h(itemView, "itemView");
                String string = parent.getContext().getString(R.string.organization_more_apps_title, this.f3342b);
                AbstractC3255y.h(string, "parent.context.getString…_title, organizationName)");
                return new C3953o0(itemView, string, null);
            case 5:
                View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_vertical_top_item, parent, false);
                AbstractC3255y.h(itemView2, "itemView");
                InterfaceC1590d interfaceC1590d4 = this.f3341a;
                Context context4 = parent.getContext();
                AbstractC3255y.h(context4, "parent.context");
                return new C3970x0(itemView2, interfaceC1590d4, null, context4);
            case 6:
                View itemView3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pb_loading_more_content, parent, false);
                AbstractC3255y.h(itemView3, "itemView");
                return new r5.J(itemView3);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }
}
