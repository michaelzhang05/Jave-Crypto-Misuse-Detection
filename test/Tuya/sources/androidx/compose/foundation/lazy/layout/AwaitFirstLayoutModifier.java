package androidx.compose.foundation.lazy.layout;

import L5.I;
import L5.s;
import P5.d;
import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    private d continuation;
    private boolean wasPositioned;

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, n nVar) {
        return androidx.compose.ui.b.c(this, obj, nVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, n nVar) {
        return androidx.compose.ui.b.d(this, obj, nVar);
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        AbstractC3159y.i(coordinates, "coordinates");
        if (!this.wasPositioned) {
            this.wasPositioned = true;
            d dVar = this.continuation;
            if (dVar != null) {
                s.a aVar = s.f6511b;
                dVar.resumeWith(s.b(I.f6487a));
            }
            this.continuation = null;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForFirstLayout(P5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            P5.d r1 = (P5.d) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier) r0
            L5.t.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            L5.t.b(r5)
            boolean r5 = r4.wasPositioned
            if (r5 != 0) goto L71
            P5.d r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            P5.i r2 = new P5.i
            P5.d r3 = Q5.b.c(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = Q5.b.e()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            L5.s$a r5 = L5.s.f6511b
            L5.I r5 = L5.I.f6487a
            java.lang.Object r5 = L5.s.b(r5)
            r1.resumeWith(r5)
        L71:
            L5.I r5 = L5.I.f6487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.waitForFirstLayout(P5.d):java.lang.Object");
    }
}
