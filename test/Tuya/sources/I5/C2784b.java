package i5;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.ErrorSupportFragment;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvMainActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2784b extends ErrorSupportFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C2784b this$0, View view) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        FragmentActivity activity;
        FragmentManager supportFragmentManager3;
        FragmentTransaction beginTransaction2;
        FragmentTransaction replace;
        FragmentTransaction addToBackStack;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() instanceof TvMainActivity) {
            FragmentActivity activity2 = this$0.getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.tv.ui.activity.TvMainActivity");
            fragment = ((TvMainActivity) activity2).x();
        } else {
            fragment = null;
        }
        if (fragment != null && (activity = this$0.getActivity()) != null && (supportFragmentManager3 = activity.getSupportFragmentManager()) != null && (beginTransaction2 = supportFragmentManager3.beginTransaction()) != null && (replace = beginTransaction2.replace(R.id.fragmentContainer, fragment)) != null && (addToBackStack = replace.addToBackStack(null)) != null) {
            addToBackStack.commit();
        }
        FragmentActivity activity3 = this$0.getActivity();
        if (activity3 != null && (supportFragmentManager2 = activity3.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager2.beginTransaction()) != null && (remove = beginTransaction.remove(this$0)) != null) {
            remove.commit();
        }
        FragmentActivity activity4 = this$0.getActivity();
        if (activity4 != null && (supportFragmentManager = activity4.getSupportFragmentManager()) != null) {
            supportFragmentManager.popBackStack();
        }
    }

    @Override // androidx.leanback.app.ErrorSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.lb_ic_sad_cloud));
        setMessage(getString(R.string.error_no_connection));
        setButtonText(getString(R.string.refresh_enc));
        setButtonClickListener(new View.OnClickListener() { // from class: i5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2784b.i(C2784b.this, view);
            }
        });
    }
}
