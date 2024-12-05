package f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import f.b;

/* loaded from: classes.dex */
public abstract class d extends b {

    /* renamed from: m, reason: collision with root package name */
    private a f6572m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6573n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends b.d {
        int[][] J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h6 = h();
            for (int i6 = 0; i6 < h6; i6++) {
                if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                    return i6;
                }
            }
            return -1;
        }

        @Override // f.b.d
        public void o(int i6, int i7) {
            super.o(i6, i7);
            int[][] iArr = new int[i7];
            System.arraycopy(this.J, 0, iArr, 0, i6);
            this.J = iArr;
        }

        @Override // f.b.d
        abstract void r();

        /* JADX INFO: Access modifiers changed from: package-private */
        public int z(int[] iArr, Drawable drawable) {
            int a6 = a(drawable);
            this.J[a6] = iArr;
            return a6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f6572m = (a) dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i6 = 0;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i7);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i8 = i6 + 1;
                if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i6] = attributeNameResource;
                i6 = i8;
            }
        }
        return StateSet.trimStateSet(iArr, i6);
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6573n && super.mutate() == this) {
            this.f6572m.r();
            this.f6573n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
