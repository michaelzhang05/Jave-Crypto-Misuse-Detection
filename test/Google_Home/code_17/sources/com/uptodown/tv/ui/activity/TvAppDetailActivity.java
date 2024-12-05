package com.uptodown.tv.ui.activity;

import O5.I;
import O5.t;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.M;

/* loaded from: classes5.dex */
public final class TvAppDetailActivity extends k5.b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
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
        private final String f30857a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TvAppDetailActivity f30859c;

        public b(TvAppDetailActivity tvAppDetailActivity, String packagename, int i8) {
            AbstractC3255y.i(packagename, "packagename");
            this.f30859c = tvAppDetailActivity;
            this.f30857a = packagename;
            this.f30858b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f30859c.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    ((TvAppDetailFragment) fragment).N0(this.f30858b, this.f30857a);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f30860a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f30861b;

        public c(int i8, C1648o c1648o) {
            this.f30860a = i8;
            this.f30861b = c1648o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Fragment fragment, c this$0) {
            AbstractC3255y.i(this$0, "this$0");
            ((TvAppDetailFragment) fragment).P0(this$0.f30860a, this$0.f30861b);
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                final Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    TvAppDetailActivity.this.runOnUiThread(new Runnable() { // from class: k5.a
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
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30863a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, S5.d dVar) {
            super(2, dVar);
            this.f30865c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30865c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30863a == 0) {
                t.b(obj);
                List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
                AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
                if (fragments.size() > 0) {
                    Fragment fragment = fragments.get(0);
                    if (fragment instanceof TvAppDetailFragment) {
                        ((TvAppDetailFragment) fragment).O0(this.f30865c);
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    @Override // k5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_app_detail_activity);
    }

    public final Object p(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new d(str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
