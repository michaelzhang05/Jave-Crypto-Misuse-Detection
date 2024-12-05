package androidx.compose.ui.platform;

import P5.AbstractC1371l;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo460onPostFlingRZ2iAVY(long j8, long j9, S5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5414getXimpl(j9));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5415getYimpl(j9));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j9 = Velocity.Companion.m5425getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5405boximpl(j9);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo461onPostScrollDzOQY0M(long j8, long j9, int i8) {
        int m4495getScrollAxesk4lQ0M;
        int m4497toViewTypeGyEprt8;
        int m4497toViewTypeGyEprt82;
        long m4496toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4495getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4495getScrollAxesk4lQ0M(j9);
        m4497toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4497toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4495getScrollAxesk4lQ0M, m4497toViewTypeGyEprt8)) {
            AbstractC1371l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2740getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2741getYimpl(j8));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2740getXimpl(j9));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2741getYimpl(j9));
            m4497toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4497toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m4497toViewTypeGyEprt82, this.consumedScrollCache);
            m4496toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4496toOffsetUv8p0NA(this.consumedScrollCache, j9);
            return m4496toOffsetUv8p0NA;
        }
        return Offset.Companion.m2756getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo462onPreFlingQWom1Mo(long j8, S5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5414getXimpl(j8));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5415getYimpl(j8));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j8 = Velocity.Companion.m5425getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5405boximpl(j8);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo463onPreScrollOzD1aCk(long j8, int i8) {
        int m4495getScrollAxesk4lQ0M;
        int m4497toViewTypeGyEprt8;
        int m4497toViewTypeGyEprt82;
        long m4496toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4495getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4495getScrollAxesk4lQ0M(j8);
        m4497toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4497toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4495getScrollAxesk4lQ0M, m4497toViewTypeGyEprt8)) {
            AbstractC1371l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2740getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2741getYimpl(j8));
            int[] iArr = this.consumedScrollCache;
            m4497toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4497toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m4497toViewTypeGyEprt82);
            m4496toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4496toOffsetUv8p0NA(this.consumedScrollCache, j8);
            return m4496toOffsetUv8p0NA;
        }
        return Offset.Companion.m2756getZeroF1C5BW0();
    }
}
