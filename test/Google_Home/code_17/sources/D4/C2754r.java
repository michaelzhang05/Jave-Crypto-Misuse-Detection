package d4;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2754r {

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f31225a;

    public C2754r(FragmentActivity activity) {
        AbstractC3255y.i(activity, "activity");
        this.f31225a = activity;
    }

    public final void a() {
        IBinder iBinder;
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.f31225a, InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            View currentFocus = this.f31225a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
