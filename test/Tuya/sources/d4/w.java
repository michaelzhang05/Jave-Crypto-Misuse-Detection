package D4;

import D4.w;
import M5.AbstractC1246t;
import T4.W;
import T4.X;
import T4.Y;
import W4.InterfaceC1481d;
import X4.C1498h;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import o5.AbstractC3548h;
import o5.C3563o0;
import o5.C3580x0;

/* loaded from: classes4.dex */
public final class w extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1798e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1481d f1799a;

    /* renamed from: b, reason: collision with root package name */
    private String f1800b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f1801c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1802d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f1803a;

        /* renamed from: b, reason: collision with root package name */
        private int f1804b;

        public final Object a() {
            Object obj = this.f1803a;
            if (obj != null) {
                return obj;
            }
            AbstractC3159y.y("item");
            return L5.I.f6487a;
        }

        public final int b() {
            return this.f1804b;
        }

        public final void c(Object obj) {
            AbstractC3159y.i(obj, "<set-?>");
            this.f1803a = obj;
        }

        public final void d(int i8) {
            this.f1804b = i8;
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1481d f1805a;

        /* renamed from: b, reason: collision with root package name */
        private Context f1806b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f1807c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f1808d;

        /* loaded from: classes4.dex */
        public final class a extends AbstractC3548h {

            /* renamed from: b, reason: collision with root package name */
            private final T4.E f1809b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1481d f1810c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f1811d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(D4.w.c r2, T4.E r3, W4.InterfaceC1481d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                    r1.f1811d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "binding.root"
                    kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f1809b = r3
                    r1.f1810c = r4
                    android.widget.TextView r2 = r3.f10098j
                    E4.j$a r4 = E4.j.f2274g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10096h
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10101m
                    android.graphics.Typeface r3 = r4.u()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.w.c.a.<init>(D4.w$c, T4.E, W4.d, android.content.Context):void");
            }

            public final void l(C1498h app, boolean z8) {
                AbstractC3159y.i(app, "app");
                int dimension = (int) this.f1811d.f1806b.getResources().getDimension(R.dimen.margin_m);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (z8) {
                    layoutParams.setMargins(dimension, 0, dimension, dimension);
                } else {
                    layoutParams.setMargins(dimension, 0, 0, dimension);
                }
                this.itemView.setLayoutParams(layoutParams);
                String e02 = app.e0();
                if (e02 != null && e02.length() != 0) {
                    com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f28003B.e0(this.f1811d.f1806b)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f1809b.f10090b);
                }
                View itemView = this.itemView;
                AbstractC3159y.h(itemView, "itemView");
                c(itemView, this.f1810c, app);
                TextView textView = this.f1809b.f10098j;
                AbstractC3159y.h(textView, "binding.tvNameHomeCardFeaturedItem");
                TextView textView2 = this.f1809b.f10096h;
                AbstractC3159y.h(textView2, "binding.tvDescHomeCardFeaturedItem");
                i(app, textView, textView2);
                String y02 = app.y0();
                TextView textView3 = this.f1809b.f10101m;
                AbstractC3159y.h(textView3, "binding.tvStatusHomeCardFeaturedItem");
                TextView textView4 = this.f1809b.f10096h;
                AbstractC3159y.h(textView4, "binding.tvDescHomeCardFeaturedItem");
                g(y02, textView3, textView4);
                ImageView imageView = this.f1809b.f10091c;
                AbstractC3159y.h(imageView, "binding.ivLogoHomeCardFeaturedItem");
                h(imageView, app.m0());
            }
        }

        public c(w wVar, InterfaceC1481d listener, Context context) {
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1808d = wVar;
            this.f1805a = listener;
            this.f1806b = context;
            this.f1807c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f1807c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3159y.i(holder, "holder");
            if (AbstractC3159y.d(this.f1807c.get(i8), AbstractC1246t.y0(this.f1807c))) {
                Object obj = this.f1807c.get(i8);
                AbstractC3159y.h(obj, "carouselApps[position]");
                holder.l((C1498h) obj, true);
            } else {
                Object obj2 = this.f1807c.get(i8);
                AbstractC3159y.h(obj2, "carouselApps[position]");
                holder.l((C1498h) obj2, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3159y.i(parent, "parent");
            T4.E c8 = T4.E.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3159y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
            return new a(this, c8, this.f1805a, this.f1806b);
        }

        public final void e(ArrayList carouselApps) {
            AbstractC3159y.i(carouselApps, "carouselApps");
            this.f1807c = carouselApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f1807c.size();
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private final c f1812b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f1813c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(D4.w r4, T4.V r5, W4.InterfaceC1481d r6, android.content.Context r7, java.lang.String r8) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3159y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3159y.i(r7, r0)
                java.lang.String r0 = "organizationName"
                kotlin.jvm.internal.AbstractC3159y.i(r8, r0)
                r3.f1813c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                r3.<init>(r0, r7)
                D4.w$c r0 = new D4.w$c
                r0.<init>(r4, r6, r7)
                r3.f1812b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f10349b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r1 = r3.itemView
                android.content.Context r1 = r1.getContext()
                r2 = 0
                r6.<init>(r1, r2, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f10349b
                r4.setAdapter(r0)
                android.widget.TextView r4 = r5.f10350c
                E4.j$a r6 = E4.j.f2274g
                android.graphics.Typeface r6 = r6.t()
                r4.setTypeface(r6)
                android.widget.TextView r4 = r5.f10350c
                r5 = 2131952407(0x7f130317, float:1.9541256E38)
                r6 = 1
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r2] = r8
                java.lang.String r5 = r7.getString(r5, r6)
                r4.setText(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.w.d.<init>(D4.w, T4.V, W4.d, android.content.Context, java.lang.String):void");
        }

        public final void l(ArrayList carouselApps) {
            AbstractC3159y.i(carouselApps, "carouselApps");
            this.f1812b.e(carouselApps);
        }

        public final c m() {
            return this.f1812b;
        }
    }

    /* loaded from: classes4.dex */
    public final class e extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private final W f1814b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1481d f1815c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1816d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f1817e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(D4.w r2, T4.W r3, W4.InterfaceC1481d r4, android.content.Context r5) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                r1.f1817e = r2
                android.widget.RelativeLayout r2 = r3.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
                r1.<init>(r2, r5)
                r1.f1814b = r3
                r1.f1815c = r4
                r1.f1816d = r5
                android.widget.TextView r2 = r3.f10364n
                E4.j$a r4 = E4.j.f2274g
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10362l
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10359i
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10363m
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10365o
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10361k
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10360j
                android.graphics.Typeface r5 = r4.t()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10358h
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f10366p
                android.graphics.Typeface r3 = r4.u()
                r2.setTypeface(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.w.e.<init>(D4.w, T4.W, W4.d, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(e this$0, C1498h app, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1815c.b(app);
        }

        public final void m(final C1498h app) {
            AbstractC3159y.i(app, "app");
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.e0()).n(UptodownApp.f28003B.e0(this.f1816d)).i(this.f1814b.f10352b);
            } else {
                this.f1814b.f10352b.setImageDrawable(ContextCompat.getDrawable(this.f1816d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1815c, app);
            TextView textView = this.f1814b.f10362l;
            AbstractC3159y.h(textView, "binding.tvTopAppNameOrganization");
            TextView textView2 = this.f1814b.f10359i;
            AbstractC3159y.h(textView2, "binding.tvTopAppDescOrganization");
            i(app, textView, textView2);
            this.f1814b.f10365o.setText(String.valueOf(app.F0() / 10.0d));
            this.f1814b.f10361k.setText(this.f1816d.getString(R.string.downloads_counter_multiple, new N4.g().b(app.Q())));
            ImageView imageView = this.f1814b.f10353c;
            AbstractC3159y.h(imageView, "binding.ivTopAppLogoOrganization");
            h(imageView, app.m0());
            if (!new C3319g().r(app.y0(), this.f1816d)) {
                this.f1814b.f10360j.setOnClickListener(new View.OnClickListener() { // from class: D4.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        w.e.n(w.e.this, app, view);
                    }
                });
            } else {
                this.f1814b.f10360j.setVisibility(8);
            }
            ProgressBar progressBar = this.f1814b.f10356f;
            AbstractC3159y.h(progressBar, "binding.pbProgressLogoOrganization");
            ImageView imageView2 = this.f1814b.f10353c;
            AbstractC3159y.h(imageView2, "binding.ivTopAppLogoOrganization");
            TextView textView3 = this.f1814b.f10359i;
            AbstractC3159y.h(textView3, "binding.tvTopAppDescOrganization");
            TextView textView4 = this.f1814b.f10358h;
            AbstractC3159y.h(textView4, "binding.tvProgressTopOrganization");
            W w8 = this.f1814b;
            TextView textView5 = w8.f10363m;
            LinearLayout linearLayout = w8.f10354d;
            AbstractC3159y.h(linearLayout, "binding.llProgressTopOrganization");
            e(app, progressBar, imageView2, textView3, textView4, textView5, linearLayout);
        }
    }

    /* loaded from: classes4.dex */
    public final class f extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1481d f1818a;

        /* renamed from: b, reason: collision with root package name */
        private Context f1819b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f1820c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f1821d;

        /* loaded from: classes4.dex */
        public final class a extends AbstractC3548h {

            /* renamed from: b, reason: collision with root package name */
            private final Y f1822b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1481d f1823c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f1824d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(D4.w.f r2, T4.Y r3, W4.InterfaceC1481d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                    r1.f1824d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "binding.root"
                    kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f1822b = r3
                    r1.f1823c = r4
                    android.widget.TextView r2 = r3.f10374f
                    E4.j$a r4 = E4.j.f2274g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10372d
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10375g
                    android.graphics.Typeface r5 = r4.t()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10376h
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f10373e
                    android.graphics.Typeface r3 = r4.u()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.w.f.a.<init>(D4.w$f, T4.Y, W4.d, android.content.Context):void");
            }

            public final void l(C1498h app) {
                AbstractC3159y.i(app, "app");
                View itemView = this.itemView;
                AbstractC3159y.h(itemView, "itemView");
                c(itemView, this.f1823c, app);
                TextView textView = this.f1822b.f10374f;
                AbstractC3159y.h(textView, "binding.tvTopAppNameOrganization");
                TextView textView2 = this.f1822b.f10372d;
                AbstractC3159y.h(textView2, "binding.tvTopAppDescOrganization");
                i(app, textView, textView2);
                String y02 = app.y0();
                TextView textView3 = this.f1822b.f10375g;
                AbstractC3159y.h(textView3, "binding.tvTopAppStatusOrganization");
                TextView textView4 = this.f1822b.f10372d;
                AbstractC3159y.h(textView4, "binding.tvTopAppDescOrganization");
                g(y02, textView3, textView4);
                ImageView imageView = this.f1822b.f10370b;
                AbstractC3159y.h(imageView, "binding.ivTopAppLogoOrganization");
                h(imageView, app.m0());
                this.f1822b.f10376h.setText(String.valueOf(app.F0() / 10.0d));
                this.f1822b.f10373e.setText(this.f1824d.f1819b.getString(R.string.downloads_counter_multiple, new N4.g().b(app.Q())));
            }
        }

        public f(w wVar, InterfaceC1481d listener, Context context) {
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1821d = wVar;
            this.f1818a = listener;
            this.f1819b = context;
            this.f1820c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f1820c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3159y.i(holder, "holder");
            Object obj = this.f1820c.get(i8);
            AbstractC3159y.h(obj, "importantApps[position]");
            holder.l((C1498h) obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3159y.i(parent, "parent");
            Y c8 = Y.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3159y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
            return new a(this, c8, this.f1818a, this.f1819b);
        }

        public final void e(ArrayList importantApps) {
            AbstractC3159y.i(importantApps, "importantApps");
            this.f1820c = importantApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f1820c.size();
        }
    }

    /* loaded from: classes4.dex */
    public final class g extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private final f f1825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f1826c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(D4.w r4, T4.X r5, W4.InterfaceC1481d r6, android.content.Context r7) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3159y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3159y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3159y.i(r7, r0)
                r3.f1826c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                r3.<init>(r0, r7)
                D4.w$f r0 = new D4.w$f
                r0.<init>(r4, r6, r7)
                r3.f1825b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f10368b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r7 = r3.itemView
                android.content.Context r7 = r7.getContext()
                r1 = 1
                r2 = 0
                r6.<init>(r7, r1, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f10368b
                r4.setAdapter(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.w.g.<init>(D4.w, T4.X, W4.d, android.content.Context):void");
        }

        public final void l(ArrayList importantApps) {
            AbstractC3159y.i(importantApps, "importantApps");
            this.f1825b.e(importantApps);
        }

        public final f m() {
            return this.f1825b;
        }
    }

    public w(InterfaceC1481d listener, String organizationName) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(organizationName, "organizationName");
        this.f1799a = listener;
        this.f1800b = organizationName;
        this.f1801c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f1801c.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1498h app = (C1498h) it.next();
                b bVar = new b();
                AbstractC3159y.h(app, "app");
                bVar.c(app);
                bVar.d(5);
                this.f1801c.add(bVar);
                notifyItemInserted(AbstractC1246t.o(this.f1801c));
            }
        }
    }

    public final void b(C1498h c1498h, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f1801c = new ArrayList();
        if (c1498h != null) {
            b bVar = new b();
            bVar.c(c1498h);
            bVar.d(1);
            this.f1801c.add(bVar);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            b bVar2 = new b();
            bVar2.c(arrayList);
            bVar2.d(2);
            this.f1801c.add(bVar2);
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            b bVar3 = new b();
            bVar3.c(arrayList2);
            bVar3.d(3);
            this.f1801c.add(bVar3);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            b bVar4 = new b();
            bVar4.c(arrayList3);
            bVar4.d(4);
            this.f1801c.add(bVar4);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C1498h app = (C1498h) it.next();
                b bVar5 = new b();
                AbstractC3159y.h(app, "app");
                bVar5.c(app);
                bVar5.d(5);
                this.f1801c.add(bVar5);
            }
        }
    }

    public final void c(boolean z8) {
        this.f1802d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(String packageName, RecyclerView recyclerView) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            if (findViewHolderForAdapterPosition instanceof e) {
                Iterator it = this.f1801c.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    int i10 = i9 + 1;
                    if (((b) it.next()).a() instanceof C1498h) {
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
                        if (AbstractC3159y.d(((C1498h) next).y0(), packageName)) {
                            obj = next;
                            break;
                        }
                    }
                    gVar.m().notifyItemChanged(AbstractC1246t.r0(gVar.m().b(), (C1498h) obj));
                } else if (findViewHolderForAdapterPosition instanceof d) {
                    d dVar = (d) findViewHolderForAdapterPosition;
                    Iterator it3 = dVar.m().b().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (AbstractC3159y.d(((C1498h) next2).y0(), packageName)) {
                            obj = next2;
                            break;
                        }
                    }
                    dVar.m().notifyItemChanged(AbstractC1246t.r0(dVar.m().b(), (C1498h) obj));
                } else if (findViewHolderForAdapterPosition instanceof C3580x0) {
                    notifyItemChanged(i8);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1801c.size() + (this.f1802d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f1801c.size()) {
            return 6;
        }
        return ((b) this.f1801c.get(i8)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof e) {
            Object a8 = ((b) this.f1801c.get(i8)).a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((e) holder).m((C1498h) a8);
            return;
        }
        if (holder instanceof g) {
            Object a9 = ((b) this.f1801c.get(i8)).a();
            AbstractC3159y.g(a9, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.AppInfo> }");
            ((g) holder).l((ArrayList) a9);
        } else if (holder instanceof d) {
            Object a10 = ((b) this.f1801c.get(i8)).a();
            AbstractC3159y.g(a10, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.AppInfo> }");
            ((d) holder).l((ArrayList) a10);
        } else if (holder instanceof C3580x0) {
            Object a11 = ((b) this.f1801c.get(i8)).a();
            AbstractC3159y.g(a11, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((C3580x0) holder).m((C1498h) a11, i8);
        } else if (holder instanceof C3563o0) {
            ((C3563o0) holder).b(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        switch (i8) {
            case 1:
                W c8 = W.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3159y.h(c8, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1481d interfaceC1481d = this.f1799a;
                Context context = parent.getContext();
                AbstractC3159y.h(context, "parent.context");
                return new e(this, c8, interfaceC1481d, context);
            case 2:
                X c9 = X.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3159y.h(c9, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1481d interfaceC1481d2 = this.f1799a;
                Context context2 = parent.getContext();
                AbstractC3159y.h(context2, "parent.context");
                return new g(this, c9, interfaceC1481d2, context2);
            case 3:
                T4.V c10 = T4.V.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3159y.h(c10, "inflate(LayoutInflater.f….context), parent, false)");
                InterfaceC1481d interfaceC1481d3 = this.f1799a;
                Context context3 = parent.getContext();
                AbstractC3159y.h(context3, "parent.context");
                return new d(this, c10, interfaceC1481d3, context3, this.f1800b);
            case 4:
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.title_organization_apps, parent, false);
                AbstractC3159y.h(itemView, "itemView");
                String string = parent.getContext().getString(R.string.organization_more_apps_title, this.f1800b);
                AbstractC3159y.h(string, "parent.context.getString…_title, organizationName)");
                return new C3563o0(itemView, string, null);
            case 5:
                View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_vertical_top_item, parent, false);
                AbstractC3159y.h(itemView2, "itemView");
                InterfaceC1481d interfaceC1481d4 = this.f1799a;
                Context context4 = parent.getContext();
                AbstractC3159y.h(context4, "parent.context");
                return new C3580x0(itemView2, interfaceC1481d4, null, context4);
            case 6:
                View itemView3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pb_loading_more_content, parent, false);
                AbstractC3159y.h(itemView3, "itemView");
                return new o5.J(itemView3);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }
}
