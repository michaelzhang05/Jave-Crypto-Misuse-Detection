package com.uptodown.activities;

import O5.InterfaceC1355k;
import a5.L;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Gallery;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class Gallery extends AbstractActivityC2683a {

    /* renamed from: Q, reason: collision with root package name */
    public static final a f29318Q = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f29320O;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29319N = O5.l.b(new c());

    /* renamed from: P, reason: collision with root package name */
    private final e f29321P = new e();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class b extends PagerAdapter {

        /* loaded from: classes4.dex */
        public static final class a implements com.squareup.picasso.A {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W4.C f29323a;

            a(W4.C c8) {
                this.f29323a = c8;
            }

            @Override // com.squareup.picasso.A
            public void a(Exception e8, Drawable drawable) {
                AbstractC3255y.i(e8, "e");
                this.f29323a.f11707c.setVisibility(8);
            }

            @Override // com.squareup.picasso.A
            public void b(Drawable drawable) {
            }

            @Override // com.squareup.picasso.A
            public void c(Bitmap bitmap, s.e from) {
                AbstractC3255y.i(bitmap, "bitmap");
                AbstractC3255y.i(from, "from");
                this.f29323a.f11706b.setImage(ImageSource.bitmap(bitmap));
                this.f29323a.f11707c.setVisibility(8);
            }
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Gallery this$0, View view) {
            AbstractC3255y.i(this$0, "this$0");
            if (UptodownApp.f29058B.a0()) {
                if (this$0.c3().f11692c.getVisibility() == 0) {
                    this$0.c3().f11692c.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.slide_to_top_toolbar));
                    this$0.c3().f11692c.setVisibility(8);
                } else {
                    this$0.c3().f11692c.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.slide_in_top_toolbar));
                    this$0.c3().f11692c.setVisibility(0);
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int i8, Object item) {
            AbstractC3255y.i(container, "container");
            AbstractC3255y.i(item, "item");
            container.removeView((RelativeLayout) item);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (Gallery.this.f29320O != null) {
                ArrayList arrayList = Gallery.this.f29320O;
                AbstractC3255y.f(arrayList);
                return arrayList.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int i8) {
            AbstractC3255y.i(container, "container");
            W4.C c8 = W4.C.c(LayoutInflater.from(container.getContext()), container, false);
            AbstractC3255y.h(c8, "inflate(LayoutInflater.f…ntext), container, false)");
            c8.f11707c.setVisibility(0);
            a aVar = new a(c8);
            c8.f11706b.setTag(aVar);
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            ArrayList arrayList = Gallery.this.f29320O;
            AbstractC3255y.f(arrayList);
            h8.l(((L) arrayList.get(i8)).i()).l(R.drawable.shape_bg_placeholder).k(aVar);
            container.addView(c8.getRoot());
            SubsamplingScaleImageView subsamplingScaleImageView = c8.f11706b;
            final Gallery gallery = Gallery.this;
            subsamplingScaleImageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Gallery.b.b(Gallery.this, view);
                }
            });
            RelativeLayout root = c8.getRoot();
            AbstractC3255y.h(root, "itemViewBinding.root");
            return root;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object object) {
            AbstractC3255y.i(view, "view");
            AbstractC3255y.i(object, "object");
            return view == object;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.B invoke() {
            return W4.B.c(Gallery.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            Gallery.this.f3(i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Gallery.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W4.B c3() {
        return (W4.B) this.f29319N.getValue();
    }

    private final void d3(int i8) {
        c3().f11694e.setAdapter(new b());
        if (i8 > 0) {
            c3().f11694e.setCurrentItem(i8);
        }
        c3().f11694e.addOnPageChangeListener(new d());
        f3(i8);
        c3().f11693d.setTypeface(H4.j.f3824g.t());
        c3().f11691b.setOnClickListener(new View.OnClickListener() { // from class: D4.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Gallery.e3(Gallery.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(Gallery this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f29321P.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(int i8) {
        Integer num;
        TextView textView = c3().f11693d;
        Integer valueOf = Integer.valueOf(i8 + 1);
        ArrayList arrayList = this.f29320O;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        textView.setText(getString(R.string.gallery_item_count, valueOf, num));
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i8;
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        setContentView(c3().getRoot());
        Window window = getWindow();
        AbstractC3255y.h(window, "window");
        Q2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f29321P);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("bundle")) != null) {
            if (bundleExtra.containsKey("images")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images", L.class);
                } else {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images");
                }
                this.f29320O = parcelableArrayList;
            }
            if (bundleExtra.containsKey("index")) {
                i8 = bundleExtra.getInt("index");
                d3(i8);
            }
        }
        i8 = 0;
        d3(i8);
    }
}
