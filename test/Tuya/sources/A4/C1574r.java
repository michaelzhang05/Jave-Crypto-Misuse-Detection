package a4;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a4.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1574r {

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f13562a;

    public C1574r(FragmentActivity activity) {
        AbstractC3159y.i(activity, "activity");
        this.f13562a = activity;
    }

    public final void a() {
        IBinder iBinder;
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.f13562a, InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            View currentFocus = this.f13562a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
