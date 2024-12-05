package androidx.compose.ui.platform;

import M5.AbstractC1239l;
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
    public Object mo455onPostFlingRZ2iAVY(long j8, long j9, P5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5409getXimpl(j9));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5410getYimpl(j9));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j9 = Velocity.Companion.m5420getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5400boximpl(j9);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo456onPostScrollDzOQY0M(long j8, long j9, int i8) {
        int m4490getScrollAxesk4lQ0M;
        int m4492toViewTypeGyEprt8;
        int m4492toViewTypeGyEprt82;
        long m4491toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4490getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4490getScrollAxesk4lQ0M(j9);
        m4492toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4492toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4490getScrollAxesk4lQ0M, m4492toViewTypeGyEprt8)) {
            AbstractC1239l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2735getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2736getYimpl(j8));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2735getXimpl(j9));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2736getYimpl(j9));
            m4492toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4492toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m4492toViewTypeGyEprt82, this.consumedScrollCache);
            m4491toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4491toOffsetUv8p0NA(this.consumedScrollCache, j9);
            return m4491toOffsetUv8p0NA;
        }
        return Offset.Companion.m2751getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo457onPreFlingQWom1Mo(long j8, P5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5409getXimpl(j8));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5410getYimpl(j8));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j8 = Velocity.Companion.m5420getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5400boximpl(j8);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo458onPreScrollOzD1aCk(long j8, int i8) {
        int m4490getScrollAxesk4lQ0M;
        int m4492toViewTypeGyEprt8;
        int m4492toViewTypeGyEprt82;
        long m4491toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4490getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4490getScrollAxesk4lQ0M(j8);
        m4492toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4492toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4490getScrollAxesk4lQ0M, m4492toViewTypeGyEprt8)) {
            AbstractC1239l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2735getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2736getYimpl(j8));
            int[] iArr = this.consumedScrollCache;
            m4492toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4492toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m4492toViewTypeGyEprt82);
            m4491toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4491toOffsetUv8p0NA(this.consumedScrollCache, j8);
            return m4491toOffsetUv8p0NA;
        }
        return Offset.Companion.m2751getZeroF1C5BW0();
    }
}
