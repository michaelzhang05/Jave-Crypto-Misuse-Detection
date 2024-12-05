package G5;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3402a;

    public i(f fVar) {
        this.f3402a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3255y.i(view, "view");
        FragmentActivity activity = this.f3402a.getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager().beginTransaction().add(new v5.i(), v5.i.f40269F).add(new E5.h(), E5.h.f2602r).commit();
        }
    }
}
