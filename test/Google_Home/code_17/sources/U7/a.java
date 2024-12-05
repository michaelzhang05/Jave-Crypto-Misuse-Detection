package U7;

import U7.a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f10500a;

    /* renamed from: b, reason: collision with root package name */
    public b f10501b;

    /* renamed from: c, reason: collision with root package name */
    public String f10502c;

    /* renamed from: d, reason: collision with root package name */
    public String f10503d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f10504e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f10505f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f10506g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f10507h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f10508i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f10509j;

    /* renamed from: U7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0207a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10510a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f10511b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f10512c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f10513d;

        /* renamed from: e, reason: collision with root package name */
        public final View f10514e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0207a(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            this.f10510a = num;
            this.f10511b = num2;
            this.f10512c = typeface;
            View findViewById = rootView.findViewById(L1.b.f5779V0);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.tv_non_switch_label)");
            this.f10513d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(L1.b.f5740C);
            AbstractC3255y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f10514e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void c(U7.d dVar);

        void d(U7.d dVar);
    }

    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10515a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f10516b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f10517c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f10518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            this.f10515a = num;
            this.f10516b = num2;
            this.f10517c = typeface;
            View findViewById = rootView.findViewById(L1.b.f5829n1);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.tv_switch_description)");
            this.f10518d = (TextView) findViewById;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10519a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f10520b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f10521c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f10522d;

        /* renamed from: e, reason: collision with root package name */
        public final View f10523e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            this.f10519a = num;
            this.f10520b = num2;
            this.f10521c = typeface;
            View findViewById = rootView.findViewById(L1.b.f5832o1);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.tv_switch_label)");
            this.f10522d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(L1.b.f5740C);
            AbstractC3255y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f10523e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final b f10524a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f10525b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f10526c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f10527d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f10528e;

        /* renamed from: f, reason: collision with root package name */
        public final Typeface f10529f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f10530g;

        /* renamed from: h, reason: collision with root package name */
        public final SwitchCompat f10531h;

        /* renamed from: i, reason: collision with root package name */
        public final View f10532i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View rootView, b listener, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface) {
            super(rootView);
            AbstractC3255y.i(rootView, "rootView");
            AbstractC3255y.i(listener, "listener");
            this.f10524a = listener;
            this.f10525b = num;
            this.f10526c = num2;
            this.f10527d = num3;
            this.f10528e = num4;
            this.f10529f = typeface;
            View findViewById = rootView.findViewById(L1.b.f5835p1);
            AbstractC3255y.h(findViewById, "rootView.findViewById(R.id.tv_switch_name)");
            this.f10530g = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(L1.b.f5813i0);
            AbstractC3255y.h(findViewById2, "rootView.findViewById(R.id.switch_item)");
            this.f10531h = (SwitchCompat) findViewById2;
            View findViewById3 = rootView.findViewById(L1.b.f5752I);
            AbstractC3255y.h(findViewById3, "rootView.findViewById(R.id.line_item)");
            this.f10532i = findViewById3;
        }

        public static final void a(e this$0, U7.d switchItem, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(switchItem, "$switchItem");
            this$0.f10524a.c(switchItem);
        }

        public static final void b(U7.d switchItem, e this$0, String tag, CompoundButton compoundButton, boolean z8) {
            AbstractC3255y.i(switchItem, "$switchItem");
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(tag, "$tag");
            switchItem.f10539b = Boolean.valueOf(z8);
            this$0.f10524a.d(switchItem);
            boolean z9 = switchItem.f10542e;
            SwitchCompat switchCompat = this$0.f10531h;
            if (switchCompat.isChecked() || !z9) {
                tag = "";
            }
            switchCompat.setText(tag);
        }

        public final void c(final U7.d switchItem, final String tag) {
            boolean booleanValue;
            String str;
            AbstractC3255y.i(switchItem, "switchItem");
            AbstractC3255y.i(tag, "tag");
            TextView textView = this.f10530g;
            String name = switchItem.f10538a.f2643b;
            Integer num = switchItem.f10544g;
            String noun = switchItem.f10543f;
            AbstractC3255y.i(name, "name");
            AbstractC3255y.i(noun, "noun");
            if (num != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" (");
                sb.append(num);
                sb.append(' ');
                String lowerCase = noun.toLowerCase(Locale.ROOT);
                AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                sb.append(')');
                name = sb.toString();
            }
            textView.setText(name);
            Integer num2 = this.f10525b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: U7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.e.a(a.e.this, switchItem, view);
                }
            });
            Typeface typeface = this.f10529f;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            SwitchCompat switchCompat = this.f10531h;
            if (switchItem.f10539b == null) {
                switchCompat.setVisibility(8);
            } else {
                switchCompat.setVisibility(0);
                Boolean bool = switchItem.f10539b;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                switchCompat.setChecked(booleanValue);
            }
            switchCompat.setContentDescription(switchItem.f10538a.f2643b);
            boolean z8 = switchItem.f10542e;
            SwitchCompat switchCompat2 = this.f10531h;
            if (!switchCompat2.isChecked() && z8) {
                str = tag;
            } else {
                str = "";
            }
            switchCompat2.setText(str);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: U7.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                    a.e.b(d.this, this, tag, compoundButton, z9);
                }
            });
            Integer num3 = this.f10526c;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = this.f10527d;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{intValue, intValue2}));
                    switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{ColorUtils.setAlphaComponent(intValue, 128), ColorUtils.setAlphaComponent(intValue2, 128)}));
                }
            }
            Integer num5 = this.f10525b;
            if (num5 != null) {
                switchCompat.setTextColor(num5.intValue());
            }
            Typeface typeface2 = this.f10529f;
            if (typeface2 != null) {
                switchCompat.setTypeface(typeface2);
            }
            Integer num6 = this.f10528e;
            if (num6 != null) {
                this.f10532i.setBackgroundColor(num6.intValue());
            }
        }
    }

    public /* synthetic */ a(List list, b bVar, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2, int i8) {
        this(list, bVar, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2, (i8 & 64) != 0 ? null : num3, (i8 & 128) != 0 ? null : num4, (i8 & 256) != 0 ? null : typeface, (i8 & 512) != 0 ? null : typeface2);
    }

    public final void a() {
        this.f10500a.add(0, new U7.d(new E6.f(0, null, 3), null, f.DESCRIPTION, null, false, null, null, 122));
    }

    public final void b(List switchItems, boolean z8) {
        AbstractC3255y.i(switchItems, "switchItems");
        this.f10500a = switchItems;
        if (!z8) {
            a();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10500a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((U7.d) this.f10500a.get(i8)).f10540c.f10565a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).c((U7.d) this.f10500a.get(i8), this.f10503d);
            return;
        }
        if (holder instanceof c) {
            c cVar = (c) holder;
            String descriptionText = this.f10502c;
            cVar.getClass();
            AbstractC3255y.i(descriptionText, "descriptionText");
            TextView textView = cVar.f10518d;
            textView.setText(descriptionText);
            Integer num = cVar.f10515a;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = cVar.f10517c;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            Integer num2 = cVar.f10516b;
            if (num2 != null) {
                int intValue = num2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(2.0f);
                gradientDrawable.setStroke(4, intValue);
                textView.setBackground(gradientDrawable);
                return;
            }
            return;
        }
        if (holder instanceof d) {
            d dVar = (d) holder;
            String labelText = ((U7.d) this.f10500a.get(i8)).f10543f;
            dVar.getClass();
            AbstractC3255y.i(labelText, "labelText");
            TextView textView2 = dVar.f10522d;
            textView2.setText(labelText);
            Integer num3 = dVar.f10519a;
            if (num3 != null) {
                textView2.setTextColor(num3.intValue());
            }
            Typeface typeface2 = dVar.f10521c;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
            }
            Integer num4 = dVar.f10520b;
            if (num4 != null) {
                dVar.f10523e.setBackgroundColor(num4.intValue());
                return;
            }
            return;
        }
        if (holder instanceof C0207a) {
            C0207a c0207a = (C0207a) holder;
            String labelText2 = ((U7.d) this.f10500a.get(i8)).f10543f;
            c0207a.getClass();
            AbstractC3255y.i(labelText2, "labelText");
            TextView textView3 = c0207a.f10513d;
            textView3.setText(labelText2);
            Integer num5 = c0207a.f10510a;
            if (num5 != null) {
                textView3.setTextColor(num5.intValue());
            }
            Typeface typeface3 = c0207a.f10512c;
            if (typeface3 != null) {
                textView3.setTypeface(typeface3);
            }
            Integer num6 = c0207a.f10511b;
            if (num6 != null) {
                c0207a.f10514e.setBackgroundColor(num6.intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        if (i8 == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5876s, parent, false);
            AbstractC3255y.h(view, "view");
            return new c(view, this.f10504e, this.f10507h, this.f10509j);
        }
        if (i8 == 2) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5877t, parent, false);
            AbstractC3255y.h(view2, "view");
            return new d(view2, this.f10504e, this.f10507h, this.f10508i);
        }
        if (i8 == 3) {
            View view3 = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5873p, parent, false);
            AbstractC3255y.h(view3, "view");
            return new C0207a(view3, this.f10504e, this.f10507h, this.f10509j);
        }
        View view4 = LayoutInflater.from(parent.getContext()).inflate(L1.c.f5875r, parent, false);
        AbstractC3255y.h(view4, "view");
        return new e(view4, this.f10501b, this.f10504e, this.f10505f, this.f10506g, this.f10507h, this.f10509j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        AbstractC3255y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).f10531h.setOnCheckedChangeListener(null);
        }
        super.onViewRecycled(holder);
    }

    public a(List switchItems, b listener, String descriptionItemText, String switchTagText, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2) {
        AbstractC3255y.i(switchItems, "switchItems");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(descriptionItemText, "descriptionItemText");
        AbstractC3255y.i(switchTagText, "switchTagText");
        this.f10500a = switchItems;
        this.f10501b = listener;
        this.f10502c = descriptionItemText;
        this.f10503d = switchTagText;
        this.f10504e = num;
        this.f10505f = num2;
        this.f10506g = num3;
        this.f10507h = num4;
        this.f10508i = typeface;
        this.f10509j = typeface2;
        if (descriptionItemText.length() > 0) {
            a();
        }
    }
}
