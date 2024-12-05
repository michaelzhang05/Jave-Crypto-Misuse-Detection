package com.uptodown.tv.ui.activity;

import X4.C1505o;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import h5.b;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class TvMyDownloadsActivity extends b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f29838a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f29839b;

        public a(int i8, C1505o c1505o) {
            this.f29838a = i8;
            this.f29839b = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvMyDownloadsActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvMyDownloadsFragment) {
                    ((TvMyDownloadsFragment) fragment).u(this.f29838a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_my_downloads_activity);
    }
}
