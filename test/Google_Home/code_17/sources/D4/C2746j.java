package d4;

import O5.x;
import P5.AbstractC1378t;
import P5.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.CompoundButtonCompat;
import b4.b;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: d4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2746j extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final a f31193h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31194a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f31195b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f31196c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31197d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31198e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31199f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31200g;

    /* renamed from: d4.j$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: d4.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31201a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(b.a it) {
            AbstractC3255y.i(it, "it");
            return it.a();
        }
    }

    public /* synthetic */ C2746j(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? false : z8);
    }

    public final CompoundButton a(b.a option, W3.b bVar, boolean z8) {
        CompoundButton materialCheckBox;
        AbstractC3255y.i(option, "option");
        if (this.f31194a) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (bVar != null) {
            String g8 = bVar.g();
            if (g8 != null && !j6.n.u(g8)) {
                CompoundButtonCompat.setButtonTintList(materialCheckBox, ColorStateList.valueOf(Color.parseColor(bVar.g())));
            }
            String p8 = bVar.p();
            if (p8 != null && !j6.n.u(p8)) {
                materialCheckBox.setTextColor(Color.parseColor(bVar.p()));
            }
        }
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.b());
        materialCheckBox.setPadding(this.f31198e, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.f31200g);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!z8) {
            layoutParams.bottomMargin = this.f31197d;
        }
        layoutParams.leftMargin = this.f31199f;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final void b(int i8) {
        View childAt = this.f31196c.getChildAt(i8);
        AbstractC3255y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void c(List list, W3.b bVar) {
        if (list != null) {
            int size = list.size();
            Iterator it = g6.m.s(0, size).iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                b.a aVar = (b.a) list.get(nextInt);
                boolean z8 = true;
                if (nextInt != size - 1) {
                    z8 = false;
                }
                this.f31196c.addView(a(aVar, bVar, z8));
            }
        }
    }

    public final void d(String str, W3.d dVar) {
        if (str != null && !j6.n.u(str)) {
            this.f31195b.a(str, dVar);
        } else {
            this.f31195b.setVisibility(8);
        }
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.f31194a) {
            return null;
        }
        g6.i s8 = g6.m.s(0, this.f31196c.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            View childAt = this.f31196c.getChildAt(((N) it).nextInt());
            AbstractC3255y.g(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.f31195b;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.f31196c;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        int size;
        Integer num;
        g6.i s8 = g6.m.s(0, this.f31196c.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            View childAt = this.f31196c.getChildAt(nextInt);
            AbstractC3255y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            if (((CompoundButton) childAt).isChecked()) {
                num = Integer.valueOf(nextInt);
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (this.f31194a) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        return AbstractC1378t.Q0(arrayList, size);
    }

    public final List<b.a> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.f31196c.getChildAt(((Number) it.next()).intValue()).getTag();
            AbstractC3255y.g(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((b.a) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return AbstractC1378t.w0(getSelectedOptions(), ",", null, null, 0, null, b.f31201a, 30, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3255y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, "state_super", Parcelable.class));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    AbstractC3255y.f(num);
                    b(num.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(x.a("state_super", super.onSaveInstanceState()), x.a("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2746j(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f31194a = z8;
        if (getId() == -1) {
            setId(S3.d.f9794x);
        }
        this.f31197d = context.getResources().getDimensionPixelSize(S3.b.f9758d);
        this.f31198e = context.getResources().getDimensionPixelSize(S3.b.f9755a);
        this.f31199f = context.getResources().getDimensionPixelSize(S3.b.f9757c);
        this.f31200g = context.getResources().getDimensionPixelSize(S3.b.f9756b);
        if (z8) {
            T3.f c8 = T3.f.c(LayoutInflater.from(context), this, true);
            AbstractC3255y.h(c8, "inflate(...)");
            ThreeDS2TextView label = c8.f10029b;
            AbstractC3255y.h(label, "label");
            this.f31195b = label;
            RadioGroup selectGroup = c8.f10030c;
            AbstractC3255y.h(selectGroup, "selectGroup");
            this.f31196c = selectGroup;
            return;
        }
        T3.e c9 = T3.e.c(LayoutInflater.from(context), this, true);
        AbstractC3255y.h(c9, "inflate(...)");
        ThreeDS2TextView label2 = c9.f10026b;
        AbstractC3255y.h(label2, "label");
        this.f31195b = label2;
        LinearLayout selectGroup2 = c9.f10027c;
        AbstractC3255y.h(selectGroup2, "selectGroup");
        this.f31196c = selectGroup2;
    }
}
