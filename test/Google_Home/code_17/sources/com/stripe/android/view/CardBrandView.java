package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.stripe.android.model.p;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardBrandView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final J2.i f28247a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f28248b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f28249c;

    /* renamed from: d, reason: collision with root package name */
    private final ListPopupWindow f28250d;

    /* renamed from: e, reason: collision with root package name */
    private o6.w f28251e;

    /* loaded from: classes4.dex */
    public static final class a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0681a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f28252a;

        /* renamed from: b, reason: collision with root package name */
        private final b f28253b;

        /* renamed from: com.stripe.android.view.CardBrandView$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0681a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readParcelable(a.class.getClassLoader()), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable, b state) {
            super(parcelable);
            AbstractC3255y.i(state, "state");
            this.f28252a = parcelable;
            this.f28253b = state;
        }

        public final b a() {
            return this.f28253b;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f28252a, aVar.f28252a) && AbstractC3255y.d(this.f28253b, aVar.f28253b);
        }

        public int hashCode() {
            Parcelable parcelable = this.f28252a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.f28253b.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f28252a + ", state=" + this.f28253b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f28252a, i8);
            this.f28253b.writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void d() {
        EnumC2791e g8;
        if (getState().i().size() > 1) {
            g8 = AbstractC2668w.a(getState().u(), getState().i(), getState().h());
        } else {
            g8 = getState().g();
        }
        if (getBrand() != g8) {
            setBrand(g8);
        }
        j();
    }

    private final void e(EnumC2791e enumC2791e) {
        Object value;
        if (enumC2791e != null) {
            o6.w wVar = this.f28251e;
            do {
                value = wVar.getValue();
            } while (!wVar.c(value, b.b((b) value, false, false, null, enumC2791e, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
            d();
        }
    }

    private final void f() {
        Context context = getContext();
        AbstractC3255y.h(context, "getContext(...)");
        C2667v c2667v = new C2667v(context, getPossibleBrands(), getBrand());
        this.f28250d.setAdapter(c2667v);
        this.f28250d.setModal(true);
        this.f28250d.setWidth(i(c2667v));
        this.f28250d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.y
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                CardBrandView.g(CardBrandView.this, adapterView, view, i8, j8);
            }
        });
        this.f28250d.setAnchorView(this.f28248b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CardBrandView this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3255y.i(this$0, "this$0");
        EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.p0(this$0.getPossibleBrands(), i8 - 1);
        if (enumC2791e != null) {
            this$0.e(enumC2791e);
        }
        this$0.f28250d.dismiss();
    }

    private final b getState() {
        return (b) this.f28251e.getValue();
    }

    private final int i(C2667v c2667v) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c2667v.getCount();
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            View view = c2667v.getView(i9, null, this);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = g6.m.d(i8, view.getMeasuredWidth());
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (getState().g() == e3.EnumC2791e.f31452w) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.f28248b
            boolean r1 = r4.getShouldShowErrorIcon()
            if (r1 == 0) goto L15
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            e3.e r1 = r1.g()
            int r1 = r1.j()
            goto L34
        L15:
            boolean r1 = r4.getShouldShowCvc()
            if (r1 == 0) goto L28
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            e3.e r1 = r1.g()
            int r1 = r1.g()
            goto L34
        L28:
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            e3.e r1 = r1.g()
            int r1 = r1.k()
        L34:
            r0.setBackgroundResource(r1)
            boolean r0 = r4.getShouldShowErrorIcon()
            r1 = 0
            if (r0 == 0) goto L40
        L3e:
            r0 = r1
            goto L63
        L40:
            boolean r0 = r4.getShouldShowCvc()
            if (r0 == 0) goto L4f
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L63
        L4f:
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.stripe.android.view.CardBrandView$b r2 = r4.getState()
            e3.e r2 = r2.g()
            e3.e r3 = e3.EnumC2791e.f31452w
            if (r2 != r3) goto L3e
        L63:
            android.widget.ImageView r2 = r4.f28248b
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.LIGHTEN
            r1.<init>(r0, r3)
        L72:
            r2.setColorFilter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardBrandView.j():void");
    }

    private final void k() {
        if (h() && getPossibleBrands().size() > 1 && !getShouldShowCvc() && !getShouldShowErrorIcon()) {
            f();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.l(CardBrandView.this, view);
                }
            });
            this.f28249c.setVisibility(0);
        } else {
            setOnClickListener(null);
            this.f28249c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(CardBrandView this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f28250d.isShowing()) {
            this$0.f28250d.dismiss();
        } else {
            this$0.f28250d.show();
        }
    }

    private final void setState(b bVar) {
        this.f28251e.setValue(bVar);
    }

    public final p.c.C0519c c() {
        String str;
        EnumC2791e brand = getBrand();
        if (brand == EnumC2791e.f31452w) {
            brand = null;
        }
        if (brand != null) {
            str = brand.f();
        } else {
            str = null;
        }
        p.c.C0519c c0519c = new p.c.C0519c(str);
        if (!h() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return c0519c;
    }

    public final EnumC2791e getBrand() {
        return getState().g();
    }

    public final List<EnumC2791e> getMerchantPreferredNetworks() {
        return getState().h();
    }

    public final List<EnumC2791e> getPossibleBrands() {
        return getState().i();
    }

    public final boolean getShouldShowCvc() {
        return getState().l();
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().p();
    }

    public final int getTintColorInt$payments_core_release() {
        return getState().s();
    }

    public final boolean h() {
        return getState().v();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        a aVar;
        b bVar;
        Parcelable superState;
        if (parcelable instanceof a) {
            aVar = (a) parcelable;
        } else {
            aVar = null;
        }
        if (aVar == null || (bVar = aVar.a()) == null) {
            bVar = new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        setState(bVar);
        d();
        k();
        if (aVar != null && (superState = aVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new a(super.onSaveInstanceState(), getState());
    }

    public final void setBrand(EnumC2791e value) {
        Object value2;
        AbstractC3255y.i(value, "value");
        o6.w wVar = this.f28251e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.c(value2, b.b((b) value2, false, false, value, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        d();
        k();
    }

    public final void setCbcEligible(boolean z8) {
        Object value;
        o6.w wVar = this.f28251e;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, b.b((b) value, z8, false, null, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        k();
    }

    public final void setMerchantPreferredNetworks(List<? extends EnumC2791e> value) {
        Object value2;
        AbstractC3255y.i(value, "value");
        o6.w wVar = this.f28251e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.c(value2, b.b((b) value2, false, false, null, null, null, value, false, false, 0, 479, null)));
        d();
    }

    public final void setPossibleBrands(List<? extends EnumC2791e> value) {
        Object value2;
        AbstractC3255y.i(value, "value");
        o6.w wVar = this.f28251e;
        do {
            value2 = wVar.getValue();
        } while (!wVar.c(value2, b.b((b) value2, false, false, null, null, value, null, false, false, 0, 495, null)));
        d();
        k();
    }

    public final void setShouldShowCvc(boolean z8) {
        Object value;
        o6.w wVar = this.f28251e;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, b.b((b) value, false, false, null, null, null, null, z8, false, 0, 447, null)));
        j();
    }

    public final void setShouldShowErrorIcon(boolean z8) {
        Object value;
        o6.w wVar = this.f28251e;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, b.b((b) value, false, false, null, null, null, null, false, z8, 0, 383, null)));
        j();
    }

    public final void setTintColorInt$payments_core_release(int i8) {
        Object value;
        o6.w wVar = this.f28251e;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, b.b((b) value, false, false, null, null, null, null, false, false, i8, 255, null)));
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        J2.i b8 = J2.i.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        this.f28247a = b8;
        ImageView icon = b8.f4853c;
        AbstractC3255y.h(icon, "icon");
        this.f28248b = icon;
        ImageView chevron = b8.f4852b;
        AbstractC3255y.h(chevron, "chevron");
        this.f28249c = chevron;
        this.f28250d = new ListPopupWindow(context);
        this.f28251e = AbstractC3700N.a(new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null));
        setClickable(false);
        setFocusable(false);
        d();
        k();
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f28254a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28255b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC2791e f28256c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC2791e f28257d;

        /* renamed from: e, reason: collision with root package name */
        private final List f28258e;

        /* renamed from: f, reason: collision with root package name */
        private final List f28259f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f28260g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f28261h;

        /* renamed from: i, reason: collision with root package name */
        private final int f28262i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                EnumC2791e valueOf = EnumC2791e.valueOf(parcel.readString());
                EnumC2791e valueOf2 = parcel.readInt() == 0 ? null : EnumC2791e.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2791e.valueOf(parcel.readString()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i9 = 0; i9 != readInt2; i9++) {
                    arrayList2.add(EnumC2791e.valueOf(parcel.readString()));
                }
                return new b(z8, z9, valueOf, valueOf2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(boolean z8, boolean z9, EnumC2791e brand, EnumC2791e enumC2791e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3255y.i(brand, "brand");
            AbstractC3255y.i(possibleBrands, "possibleBrands");
            AbstractC3255y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.f28254a = z8;
            this.f28255b = z9;
            this.f28256c = brand;
            this.f28257d = enumC2791e;
            this.f28258e = possibleBrands;
            this.f28259f = merchantPreferredNetworks;
            this.f28260g = z10;
            this.f28261h = z11;
            this.f28262i = i8;
        }

        public static /* synthetic */ b b(b bVar, boolean z8, boolean z9, EnumC2791e enumC2791e, EnumC2791e enumC2791e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, Object obj) {
            boolean z12;
            boolean z13;
            EnumC2791e enumC2791e3;
            EnumC2791e enumC2791e4;
            List list3;
            List list4;
            boolean z14;
            boolean z15;
            int i10;
            if ((i9 & 1) != 0) {
                z12 = bVar.f28254a;
            } else {
                z12 = z8;
            }
            if ((i9 & 2) != 0) {
                z13 = bVar.f28255b;
            } else {
                z13 = z9;
            }
            if ((i9 & 4) != 0) {
                enumC2791e3 = bVar.f28256c;
            } else {
                enumC2791e3 = enumC2791e;
            }
            if ((i9 & 8) != 0) {
                enumC2791e4 = bVar.f28257d;
            } else {
                enumC2791e4 = enumC2791e2;
            }
            if ((i9 & 16) != 0) {
                list3 = bVar.f28258e;
            } else {
                list3 = list;
            }
            if ((i9 & 32) != 0) {
                list4 = bVar.f28259f;
            } else {
                list4 = list2;
            }
            if ((i9 & 64) != 0) {
                z14 = bVar.f28260g;
            } else {
                z14 = z10;
            }
            if ((i9 & 128) != 0) {
                z15 = bVar.f28261h;
            } else {
                z15 = z11;
            }
            if ((i9 & 256) != 0) {
                i10 = bVar.f28262i;
            } else {
                i10 = i8;
            }
            return bVar.a(z12, z13, enumC2791e3, enumC2791e4, list3, list4, z14, z15, i10);
        }

        public final b a(boolean z8, boolean z9, EnumC2791e brand, EnumC2791e enumC2791e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3255y.i(brand, "brand");
            AbstractC3255y.i(possibleBrands, "possibleBrands");
            AbstractC3255y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new b(z8, z9, brand, enumC2791e, possibleBrands, merchantPreferredNetworks, z10, z11, i8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f28254a == bVar.f28254a && this.f28255b == bVar.f28255b && this.f28256c == bVar.f28256c && this.f28257d == bVar.f28257d && AbstractC3255y.d(this.f28258e, bVar.f28258e) && AbstractC3255y.d(this.f28259f, bVar.f28259f) && this.f28260g == bVar.f28260g && this.f28261h == bVar.f28261h && this.f28262i == bVar.f28262i;
        }

        public final EnumC2791e g() {
            return this.f28256c;
        }

        public final List h() {
            return this.f28259f;
        }

        public int hashCode() {
            int a8 = ((((androidx.compose.foundation.a.a(this.f28254a) * 31) + androidx.compose.foundation.a.a(this.f28255b)) * 31) + this.f28256c.hashCode()) * 31;
            EnumC2791e enumC2791e = this.f28257d;
            return ((((((((((a8 + (enumC2791e == null ? 0 : enumC2791e.hashCode())) * 31) + this.f28258e.hashCode()) * 31) + this.f28259f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f28260g)) * 31) + androidx.compose.foundation.a.a(this.f28261h)) * 31) + this.f28262i;
        }

        public final List i() {
            return this.f28258e;
        }

        public final boolean l() {
            return this.f28260g;
        }

        public final boolean p() {
            return this.f28261h;
        }

        public final int s() {
            return this.f28262i;
        }

        public String toString() {
            return "State(isCbcEligible=" + this.f28254a + ", isLoading=" + this.f28255b + ", brand=" + this.f28256c + ", userSelectedBrand=" + this.f28257d + ", possibleBrands=" + this.f28258e + ", merchantPreferredNetworks=" + this.f28259f + ", shouldShowCvc=" + this.f28260g + ", shouldShowErrorIcon=" + this.f28261h + ", tintColor=" + this.f28262i + ")";
        }

        public final EnumC2791e u() {
            return this.f28257d;
        }

        public final boolean v() {
            return this.f28254a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f28254a ? 1 : 0);
            out.writeInt(this.f28255b ? 1 : 0);
            out.writeString(this.f28256c.name());
            EnumC2791e enumC2791e = this.f28257d;
            if (enumC2791e == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC2791e.name());
            }
            List list = this.f28258e;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2791e) it.next()).name());
            }
            List list2 = this.f28259f;
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeString(((EnumC2791e) it2.next()).name());
            }
            out.writeInt(this.f28260g ? 1 : 0);
            out.writeInt(this.f28261h ? 1 : 0);
            out.writeInt(this.f28262i);
        }

        public /* synthetic */ b(boolean z8, boolean z9, EnumC2791e enumC2791e, EnumC2791e enumC2791e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, AbstractC3247p abstractC3247p) {
            this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? EnumC2791e.f31452w : enumC2791e, (i9 & 8) != 0 ? null : enumC2791e2, (i9 & 16) != 0 ? AbstractC1378t.m() : list, (i9 & 32) != 0 ? AbstractC1378t.m() : list2, (i9 & 64) != 0 ? false : z10, (i9 & 128) != 0 ? false : z11, (i9 & 256) == 0 ? i8 : 0);
        }
    }
}
