package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.i;
import p.e;
import p.g;
import p.l;

/* loaded from: classes.dex */
public class Flow extends i {

    /* renamed from: k, reason: collision with root package name */
    private g f1496k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.i, androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f1496k = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1690a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.f1697b1) {
                    this.f1496k.S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1704c1) {
                    this.f1496k.Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1774m1) {
                    this.f1496k.d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1781n1) {
                    this.f1496k.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1711d1) {
                    this.f1496k.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1718e1) {
                    this.f1496k.e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1725f1) {
                    this.f1496k.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.f1732g1) {
                    this.f1496k.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.L1) {
                    this.f1496k.X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.B1) {
                    this.f1496k.M1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.K1) {
                    this.f1496k.W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1833v1) {
                    this.f1496k.G1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.D1) {
                    this.f1496k.O1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1845x1) {
                    this.f1496k.I1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.F1) {
                    this.f1496k.Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1857z1) {
                    this.f1496k.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f1827u1) {
                    this.f1496k.F1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.C1) {
                    this.f1496k.N1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f1839w1) {
                    this.f1496k.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.E1) {
                    this.f1496k.P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.I1) {
                    this.f1496k.U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == h.f1851y1) {
                    this.f1496k.J1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.H1) {
                    this.f1496k.T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == h.A1) {
                    this.f1496k.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.J1) {
                    this.f1496k.V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == h.G1) {
                    this.f1496k.R1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f1593d = this.f1496k;
        m();
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(e eVar, boolean z5) {
        this.f1496k.K0(z5);
    }

    @Override // androidx.constraintlayout.widget.i
    public void n(l lVar, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    protected void onMeasure(int i6, int i7) {
        n(this.f1496k, i6, i7);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f1496k.F1(f6);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.f1496k.G1(i6);
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f1496k.H1(f6);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.f1496k.I1(i6);
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.f1496k.J1(i6);
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f1496k.K1(f6);
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.f1496k.L1(i6);
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.f1496k.M1(i6);
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.f1496k.R1(i6);
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.f1496k.S1(i6);
        requestLayout();
    }

    public void setPadding(int i6) {
        this.f1496k.Y0(i6);
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.f1496k.Z0(i6);
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.f1496k.b1(i6);
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.f1496k.c1(i6);
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.f1496k.e1(i6);
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.f1496k.T1(i6);
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f1496k.U1(f6);
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.f1496k.V1(i6);
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.f1496k.W1(i6);
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.f1496k.X1(i6);
        requestLayout();
    }
}
