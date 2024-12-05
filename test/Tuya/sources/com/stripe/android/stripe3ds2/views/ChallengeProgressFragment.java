package com.stripe.android.stripe3ds2.views;

import Q3.k;
import X3.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class ChallengeProgressFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final String f26976a;

    /* renamed from: b, reason: collision with root package name */
    private final q f26977b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f26978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, q sdkTransactionId, Integer num) {
        super(P3.e.f7976k);
        AbstractC3159y.i(directoryServerName, "directoryServerName");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        this.f26976a = directoryServerName;
        this.f26977b = sdkTransactionId;
        this.f26978c = num;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        k a8 = k.a(view);
        AbstractC3159y.h(a8, "bind(...)");
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext(...)");
        a a9 = a.f27001e.a(this.f26976a, new U3.a(requireContext, new U3.e(this.f26977b), null, null, null, null, null, 0, 252, null));
        ImageView imageView = a8.f8259b;
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
            AbstractC3159y.f(imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        AbstractC3159y.f(imageView);
        imageView.setVisibility(0);
        Integer num = this.f26978c;
        if (num != null) {
            a8.f8260c.setIndicatorColor(num.intValue());
        }
    }
}
