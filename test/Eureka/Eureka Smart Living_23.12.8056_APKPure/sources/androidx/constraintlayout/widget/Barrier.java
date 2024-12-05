package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: i, reason: collision with root package name */
    private int f1497i;

    /* renamed from: j, reason: collision with root package name */
    private int f1498j;

    /* renamed from: k, reason: collision with root package name */
    private p.a f1499k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000f, code lost:
    
        if (r6 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r6 == 6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o(p.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1498j = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f1497i
            if (r6 != r2) goto Lf
        Lc:
            r3.f1498j = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f1497i
            if (r6 != r2) goto L19
        L16:
            r3.f1498j = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof p.a
            if (r5 == 0) goto L27
            p.a r4 = (p.a) r4
            int r5 = r3.f1498j
            r4.P0(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.o(p.e, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f1499k = new p.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1690a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.f1802q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1795p1) {
                    this.f1499k.O0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == h.f1809r1) {
                    this.f1499k.Q0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1593d = this.f1499k;
        m();
    }

    public int getMargin() {
        return this.f1499k.M0();
    }

    public int getType() {
        return this.f1497i;
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(p.e eVar, boolean z5) {
        o(eVar, this.f1497i, z5);
    }

    public boolean n() {
        return this.f1499k.K0();
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f1499k.O0(z5);
    }

    public void setDpMargin(int i6) {
        this.f1499k.Q0((int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i6) {
        this.f1499k.Q0(i6);
    }

    public void setType(int i6) {
        this.f1497i = i6;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
