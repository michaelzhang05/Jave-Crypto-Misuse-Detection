package com.stripe.android.stripe3ds2.views;

import T3.k;
import a4.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class ChallengeProgressFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final String f28031a;

    /* renamed from: b, reason: collision with root package name */
    private final q f28032b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, q sdkTransactionId, Integer num) {
        super(S3.e.f9807k);
        AbstractC3255y.i(directoryServerName, "directoryServerName");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        this.f28031a = directoryServerName;
        this.f28032b = sdkTransactionId;
        this.f28033c = num;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        k a8 = k.a(view);
        AbstractC3255y.h(a8, "bind(...)");
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext(...)");
        a a9 = a.f28056e.a(this.f28031a, new X3.a(requireContext, new X3.e(this.f28032b), null, null, null, null, null, 0, 252, null));
        ImageView imageView = a8.f10056b;
        FragmentActivity activity = getActivity();
        String str = null;
        if (activity != null) {
            drawable = ContextCompat.getDrawable(activity, a9.c());
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        Integer e8 = a9.e();
        if (e8 != null) {
            str = getString(e8.intValue());
        }
        imageView.setContentDescription(str);
        if (a9.f()) {
            AbstractC3255y.f(imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        AbstractC3255y.f(imageView);
        imageView.setVisibility(0);
        Integer num = this.f28033c;
        if (num != null) {
            a8.f10057c.setIndicatorColor(num.intValue());
        }
    }
}
