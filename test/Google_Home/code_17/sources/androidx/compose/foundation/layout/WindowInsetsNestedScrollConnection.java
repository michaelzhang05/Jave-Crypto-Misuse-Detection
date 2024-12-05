package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import c6.AbstractC2055a;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import l6.InterfaceC3372o;
import l6.InterfaceC3390x0;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(30)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private InterfaceC3390x0 animationJob;
    private final CancellationSignal cancellationSignal;
    private InterfaceC3372o continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets windowInsets, View view, SideCalculator sideCalculator, Density density) {
        AbstractC3255y.i(windowInsets, "windowInsets");
        AbstractC3255y.i(view, "view");
        AbstractC3255y.i(sideCalculator, "sideCalculator");
        AbstractC3255y.i(density, "density");
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
        this.cancellationSignal = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f8) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            AbstractC3255y.h(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, AbstractC2055a.d(f8)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.isVisible());
            }
        }
        this.animationController = null;
        InterfaceC3372o interfaceC3372o = this.continuation;
        if (interfaceC3372o != null) {
            interfaceC3372o.r(null, WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE);
        }
        this.continuation = null;
        InterfaceC3390x0 interfaceC3390x0 = this.animationJob;
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m680flinghuYlsQE(long r26, float r28, boolean r29, S5.d r30) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m680flinghuYlsQE(long, float, boolean, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(S5.d dVar) {
        Object obj = this.animationController;
        if (obj == null) {
            C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
            c3374p.C();
            this.continuation = c3374p;
            requestAnimationController();
            obj = c3374p.y();
            if (obj == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (!this.isControllerRequested) {
            this.isControllerRequested = true;
            windowInsetsController = this.view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, k.a(this));
            }
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m681scroll8S9VItk(long j8, float f8) {
        boolean z8;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        int i8;
        InterfaceC3390x0 interfaceC3390x0 = this.animationJob;
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f8 != 0.0f) {
            boolean isVisible = this.windowInsets.isVisible();
            if (f8 > 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (isVisible != z8 || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo633consumedOffsetsMKHz9U(j8);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                AbstractC3255y.h(hiddenStateInsets, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                AbstractC3255y.h(shownStateInsets, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                AbstractC3255y.h(currentInsets, "animationController.currentInsets");
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (f8 > 0.0f) {
                    i8 = valueOf2;
                } else {
                    i8 = valueOf;
                }
                if (valueOf3 == i8) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m2756getZeroF1C5BW0();
                }
                float f9 = valueOf3 + f8 + this.partialConsumption;
                int k8 = g6.m.k(AbstractC2055a.d(f9), valueOf, valueOf2);
                this.partialConsumption = f9 - AbstractC2055a.d(f9);
                if (k8 != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, k8), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo633consumedOffsetsMKHz9U(j8);
            }
        }
        return Offset.Companion.m2756getZeroF1C5BW0();
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        InterfaceC3372o interfaceC3372o = this.continuation;
        if (interfaceC3372o != null) {
            interfaceC3372o.r(null, WindowInsetsNestedScrollConnection$dispose$1.INSTANCE);
        }
        InterfaceC3390x0 interfaceC3390x0 = this.animationJob;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!AbstractC3255y.d(currentInsets, hiddenStateInsets));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController controller) {
        AbstractC3255y.i(controller, "controller");
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo460onPostFlingRZ2iAVY(long j8, long j9, S5.d dVar) {
        return m680flinghuYlsQE(j9, this.sideCalculator.showMotion(Velocity.m5414getXimpl(j9), Velocity.m5415getYimpl(j9)), true, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo461onPostScrollDzOQY0M(long j8, long j9, int i8) {
        return m681scroll8S9VItk(j9, this.sideCalculator.showMotion(Offset.m2740getXimpl(j9), Offset.m2741getYimpl(j9)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo462onPreFlingQWom1Mo(long j8, S5.d dVar) {
        return m680flinghuYlsQE(j8, this.sideCalculator.hideMotion(Velocity.m5414getXimpl(j8), Velocity.m5415getYimpl(j8)), false, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo463onPreScrollOzD1aCk(long j8, int i8) {
        return m681scroll8S9VItk(j8, this.sideCalculator.hideMotion(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8)));
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController controller, int i8) {
        AbstractC3255y.i(controller, "controller");
        this.animationController = controller;
        this.isControllerRequested = false;
        InterfaceC3372o interfaceC3372o = this.continuation;
        if (interfaceC3372o != null) {
            interfaceC3372o.r(controller, WindowInsetsNestedScrollConnection$onReady$1.INSTANCE);
        }
        this.continuation = null;
    }
}
