package a4;

import L5.x;
import M5.AbstractC1246t;
import M5.N;
import Y3.b;
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
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: a4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1566j extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final a f13530h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13531a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f13532b;

    /* renamed from: c, reason: collision with root package name */
    private final LinearLayout f13533c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13534d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13535e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13536f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13537g;

    /* renamed from: a4.j$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: a4.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13538a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(b.a it) {
            AbstractC3159y.i(it, "it");
            return it.b();
        }
    }

    public /* synthetic */ C1566j(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? false : z8);
    }

    public final CompoundButton a(b.a option, T3.b bVar, boolean z8) {
        CompoundButton materialCheckBox;
        AbstractC3159y.i(option, "option");
        if (this.f13531a) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (bVar != null) {
            String e8 = bVar.e();
            if (e8 != null && !g6.n.u(e8)) {
                CompoundButtonCompat.setButtonTintList(materialCheckBox, ColorStateList.valueOf(Color.parseColor(bVar.e())));
            }
            String k8 = bVar.k();
            if (k8 != null && !g6.n.u(k8)) {
                materialCheckBox.setTextColor(Color.parseColor(bVar.k()));
            }
        }
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.c());
        materialCheckBox.setPadding(this.f13535e, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.f13537g);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!z8) {
            layoutParams.bottomMargin = this.f13534d;
        }
        layoutParams.leftMargin = this.f13536f;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final void b(int i8) {
        View childAt = this.f13533c.getChildAt(i8);
        AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void c(List list, T3.b bVar) {
        if (list != null) {
            int size = list.size();
            Iterator it = d6.m.s(0, size).iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                b.a aVar = (b.a) list.get(nextInt);
                boolean z8 = true;
                if (nextInt != size - 1) {
                    z8 = false;
                }
                this.f13533c.addView(a(aVar, bVar, z8));
            }
        }
    }

    public final void d(String str, T3.d dVar) {
        if (str != null && !g6.n.u(str)) {
            this.f13532b.a(str, dVar);
        } else {
            this.f13532b.setVisibility(8);
        }
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.f13531a) {
            return null;
        }
        d6.i s8 = d6.m.s(0, this.f13533c.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            View childAt = this.f13533c.getChildAt(((N) it).nextInt());
            AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.f13532b;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.f13533c;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        int size;
        Integer num;
        d6.i s8 = d6.m.s(0, this.f13533c.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            View childAt = this.f13533c.getChildAt(nextInt);
            AbstractC3159y.g(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            if (((CompoundButton) childAt).isChecked()) {
                num = Integer.valueOf(nextInt);
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (this.f13531a) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        return AbstractC1246t.Q0(arrayList, size);
    }

    public final List<b.a> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.f13533c.getChildAt(((Number) it.next()).intValue()).getTag();
            AbstractC3159y.g(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((b.a) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return AbstractC1246t.w0(getSelectedOptions(), ",", null, null, 0, null, b.f13538a, 30, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3159y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, "state_super", Parcelable.class));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    AbstractC3159y.f(num);
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
    public C1566j(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f13531a = z8;
        if (getId() == -1) {
            setId(P3.d.f7963x);
        }
        this.f13534d = context.getResources().getDimensionPixelSize(P3.b.f7927d);
        this.f13535e = context.getResources().getDimensionPixelSize(P3.b.f7924a);
        this.f13536f = context.getResources().getDimensionPixelSize(P3.b.f7926c);
        this.f13537g = context.getResources().getDimensionPixelSize(P3.b.f7925b);
        if (z8) {
            Q3.f c8 = Q3.f.c(LayoutInflater.from(context), this, true);
            AbstractC3159y.h(c8, "inflate(...)");
            ThreeDS2TextView label = c8.f8232b;
            AbstractC3159y.h(label, "label");
            this.f13532b = label;
            RadioGroup selectGroup = c8.f8233c;
            AbstractC3159y.h(selectGroup, "selectGroup");
            this.f13533c = selectGroup;
            return;
        }
        Q3.e c9 = Q3.e.c(LayoutInflater.from(context), this, true);
        AbstractC3159y.h(c9, "inflate(...)");
        ThreeDS2TextView label2 = c9.f8229b;
        AbstractC3159y.h(label2, "label");
        this.f13532b = label2;
        LinearLayout selectGroup2 = c9.f8230c;
        AbstractC3159y.h(selectGroup2, "selectGroup");
        this.f13533c = selectGroup2;
    }
}
