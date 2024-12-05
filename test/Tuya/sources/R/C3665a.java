package r;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3665a implements InterfaceC3667c {

    /* renamed from: a, reason: collision with root package name */
    private final View f37494a;

    /* renamed from: b, reason: collision with root package name */
    private final Window f37495b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowInsetsControllerCompat f37496c;

    public C3665a(View view, Window window) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3159y.i(view, "view");
        this.f37494a = view;
        this.f37495b = window;
        if (window != null) {
            windowInsetsControllerCompat = WindowCompat.getInsetsController(window, view);
        } else {
            windowInsetsControllerCompat = null;
        }
        this.f37496c = windowInsetsControllerCompat;
    }

    @Override // r.InterfaceC3667c
    public void a(long j8, boolean z8, boolean z9, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3159y.i(transformColorForLightContent, "transformColorForLightContent");
        d(z8);
        c(z9);
        Window window = this.f37495b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f37496c) == null || !windowInsetsControllerCompat.isAppearanceLightNavigationBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2961boximpl(j8))).m2981unboximpl();
            }
            window.setNavigationBarColor(ColorKt.m3025toArgb8_81llA(j8));
        }
    }

    @Override // r.InterfaceC3667c
    public void b(long j8, boolean z8, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3159y.i(transformColorForLightContent, "transformColorForLightContent");
        e(z8);
        Window window = this.f37495b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f37496c) == null || !windowInsetsControllerCompat.isAppearanceLightStatusBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2961boximpl(j8))).m2981unboximpl();
            }
            window.setStatusBarColor(ColorKt.m3025toArgb8_81llA(j8));
        }
    }

    public void c(boolean z8) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f37495b) != null) {
            window.setNavigationBarContrastEnforced(z8);
        }
    }

    public void d(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f37496c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(z8);
        }
    }

    public void e(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f37496c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(z8);
        }
    }
}
