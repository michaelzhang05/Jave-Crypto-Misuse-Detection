package com.uptodown.tv.ui.activity;

import L5.I;
import L5.t;
import X4.C1505o;
import X5.n;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class TvAppDetailActivity extends h5.b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    ((TvAppDetailFragment) fragment).b0();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f29826a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TvAppDetailActivity f29828c;

        public b(TvAppDetailActivity tvAppDetailActivity, String packagename, int i8) {
            AbstractC3159y.i(packagename, "packagename");
            this.f29828c = tvAppDetailActivity;
            this.f29826a = packagename;
            this.f29827b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f29828c.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    ((TvAppDetailFragment) fragment).N0(this.f29827b, this.f29826a);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29829a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f29830b;

        public c(int i8, C1505o c1505o) {
            this.f29829a = i8;
            this.f29830b = c1505o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Fragment fragment, c this$0) {
            AbstractC3159y.i(this$0, "this$0");
            ((TvAppDetailFragment) fragment).P0(this$0.f29829a, this$0.f29830b);
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                final Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    TvAppDetailActivity.this.runOnUiThread(new Runnable() { // from class: h5.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            TvAppDetailActivity.c.b(Fragment.this, this);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29832a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29834c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, P5.d dVar) {
            super(2, dVar);
            this.f29834c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29834c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29832a == 0) {
                t.b(obj);
                List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
                AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
                if (fragments.size() > 0) {
                    Fragment fragment = fragments.get(0);
                    if (fragment instanceof TvAppDetailFragment) {
                        ((TvAppDetailFragment) fragment).O0(this.f29834c);
                    }
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // h5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_app_detail_activity);
    }

    public final Object p(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new d(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
