package D5;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1860a;

    public i(f fVar) {
        this.f1860a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3159y.i(view, "view");
        FragmentActivity activity = this.f1860a.getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager().beginTransaction().add(new s5.i(), s5.i.f37996F).add(new B5.h(), B5.h.f1007r).commit();
        }
    }
}
