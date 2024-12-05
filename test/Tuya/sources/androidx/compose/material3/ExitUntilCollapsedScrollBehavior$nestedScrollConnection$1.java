package androidx.compose.material3;

import P5.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* loaded from: classes.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo455onPostFlingRZ2iAVY(long r10, long r12, P5.d r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = Q5.b.e()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            long r10 = r0.J$0
            L5.t.b(r14)
            goto L80
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) r10
            L5.t.b(r14)
            goto L55
        L40:
            L5.t.b(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = androidx.compose.ui.input.nestedscroll.a.a(r1, r2, r4, r6)
            if (r14 != r7) goto L54
            return r7
        L54:
            r10 = r9
        L55:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r1 = r14.m5418unboximpl()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r11 = r10.this$0
            androidx.compose.material3.TopAppBarState r11 = r11.getState()
            float r12 = androidx.compose.ui.unit.Velocity.m5410getYimpl(r12)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r13 = r10.this$0
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.getFlingAnimationSpec()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r10 = r10.this$0
            androidx.compose.animation.core.AnimationSpec r10 = r10.getSnapAnimationSpec()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.access$settleAppBar(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L7f
            return r7
        L7f:
            r10 = r1
        L80:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r12 = r14.m5418unboximpl()
            long r10 = androidx.compose.ui.unit.Velocity.m5413plusAH228Gc(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m5400boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo455onPostFlingRZ2iAVY(long, long, P5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo456onPostScrollDzOQY0M(long j8, long j9, int i8) {
        if (!((Boolean) this.this$0.getCanScroll().invoke()).booleanValue()) {
            return Offset.Companion.m2751getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        state.setContentOffset(state.getContentOffset() + Offset.m2736getYimpl(j8));
        if (Offset.m2736getYimpl(j9) >= 0.0f && Offset.m2736getYimpl(j8) >= 0.0f) {
            if (Offset.m2736getYimpl(j8) == 0.0f && Offset.m2736getYimpl(j9) > 0.0f) {
                this.this$0.getState().setContentOffset(0.0f);
            }
            if (Offset.m2736getYimpl(j9) > 0.0f) {
                float heightOffset = this.this$0.getState().getHeightOffset();
                this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m2736getYimpl(j9));
                return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset);
            }
            return Offset.Companion.m2751getZeroF1C5BW0();
        }
        float heightOffset2 = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m2736getYimpl(j8));
        return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo457onPreFlingQWom1Mo(long j8, d dVar) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j8, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo458onPreScrollOzD1aCk(long j8, int i8) {
        if (((Boolean) this.this$0.getCanScroll().invoke()).booleanValue() && Offset.m2736getYimpl(j8) <= 0.0f) {
            float heightOffset = this.this$0.getState().getHeightOffset();
            this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m2736getYimpl(j8));
            if (heightOffset == this.this$0.getState().getHeightOffset()) {
                return Offset.Companion.m2751getZeroF1C5BW0();
            }
            return Offset.m2729copydBAh8RU$default(j8, 0.0f, 0.0f, 2, null);
        }
        return Offset.Companion.m2751getZeroF1C5BW0();
    }
}
