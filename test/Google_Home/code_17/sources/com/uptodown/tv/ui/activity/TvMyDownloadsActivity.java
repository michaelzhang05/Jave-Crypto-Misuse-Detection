package com.uptodown.tv.ui.activity;

import a5.C1648o;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import java.util.List;
import k5.b;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class TvMyDownloadsActivity extends b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f30870a;

        /* renamed from: b, reason: collision with root package name */
        private final C1648o f30871b;

        public a(int i8, C1648o c1648o) {
            this.f30870a = i8;
            this.f30871b = c1648o;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvMyDownloadsActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvMyDownloadsFragment) {
                    ((TvMyDownloadsFragment) fragment).u(this.f30870a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_my_downloads_activity);
    }
}
