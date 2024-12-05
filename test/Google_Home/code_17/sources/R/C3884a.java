package r;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3884a implements InterfaceC3886c {

    /* renamed from: a, reason: collision with root package name */
    private final View f38432a;

    /* renamed from: b, reason: collision with root package name */
    private final Window f38433b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowInsetsControllerCompat f38434c;

    public C3884a(View view, Window window) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3255y.i(view, "view");
        this.f38432a = view;
        this.f38433b = window;
        if (window != null) {
            windowInsetsControllerCompat = WindowCompat.getInsetsController(window, view);
        } else {
            windowInsetsControllerCompat = null;
        }
        this.f38434c = windowInsetsControllerCompat;
    }

    @Override // r.InterfaceC3886c
    public void a(long j8, boolean z8, boolean z9, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3255y.i(transformColorForLightContent, "transformColorForLightContent");
        d(z8);
        c(z9);
        Window window = this.f38433b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f38434c) == null || !windowInsetsControllerCompat.isAppearanceLightNavigationBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2966boximpl(j8))).m2986unboximpl();
            }
            window.setNavigationBarColor(ColorKt.m3030toArgb8_81llA(j8));
        }
    }

    @Override // r.InterfaceC3886c
    public void b(long j8, boolean z8, Function1 transformColorForLightContent) {
        WindowInsetsControllerCompat windowInsetsControllerCompat;
        AbstractC3255y.i(transformColorForLightContent, "transformColorForLightContent");
        e(z8);
        Window window = this.f38433b;
        if (window != null) {
            if (z8 && ((windowInsetsControllerCompat = this.f38434c) == null || !windowInsetsControllerCompat.isAppearanceLightStatusBars())) {
                j8 = ((Color) transformColorForLightContent.invoke(Color.m2966boximpl(j8))).m2986unboximpl();
            }
            window.setStatusBarColor(ColorKt.m3030toArgb8_81llA(j8));
        }
    }

    public void c(boolean z8) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f38433b) != null) {
            window.setNavigationBarContrastEnforced(z8);
        }
    }

    public void d(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f38434c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(z8);
        }
    }

    public void e(boolean z8) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f38434c;
        if (windowInsetsControllerCompat != null) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(z8);
        }
    }
}
