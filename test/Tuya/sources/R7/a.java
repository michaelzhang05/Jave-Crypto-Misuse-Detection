package R7;

import R7.a;
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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public List f8874a;

    /* renamed from: b, reason: collision with root package name */
    public b f8875b;

    /* renamed from: c, reason: collision with root package name */
    public String f8876c;

    /* renamed from: d, reason: collision with root package name */
    public String f8877d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8878e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f8879f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f8880g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f8881h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f8882i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f8883j;

    /* renamed from: R7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0182a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8884a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8885b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8886c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8887d;

        /* renamed from: e, reason: collision with root package name */
        public final View f8888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0182a(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8884a = num;
            this.f8885b = num2;
            this.f8886c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3784V0);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_non_switch_label)");
            this.f8887d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3745C);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f8888e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void b(R7.d dVar);

        void d(R7.d dVar);
    }

    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8889a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8890b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8891c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8892d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8889a = num;
            this.f8890b = num2;
            this.f8891c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3834n1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_description)");
            this.f8892d = (TextView) findViewById;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f8893a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8894b;

        /* renamed from: c, reason: collision with root package name */
        public final Typeface f8895c;

        /* renamed from: d, reason: collision with root package name */
        public final TextView f8896d;

        /* renamed from: e, reason: collision with root package name */
        public final View f8897e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View rootView, Integer num, Integer num2, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8893a = num;
            this.f8894b = num2;
            this.f8895c = typeface;
            View findViewById = rootView.findViewById(I1.b.f3837o1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_label)");
            this.f8896d = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3745C);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.item_divider)");
            this.f8897e = findViewById2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final b f8898a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f8899b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f8900c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f8901d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f8902e;

        /* renamed from: f, reason: collision with root package name */
        public final Typeface f8903f;

        /* renamed from: g, reason: collision with root package name */
        public final TextView f8904g;

        /* renamed from: h, reason: collision with root package name */
        public final SwitchCompat f8905h;

        /* renamed from: i, reason: collision with root package name */
        public final View f8906i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View rootView, b listener, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            AbstractC3159y.i(listener, "listener");
            this.f8898a = listener;
            this.f8899b = num;
            this.f8900c = num2;
            this.f8901d = num3;
            this.f8902e = num4;
            this.f8903f = typeface;
            View findViewById = rootView.findViewById(I1.b.f3840p1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_switch_name)");
            this.f8904g = (TextView) findViewById;
            View findViewById2 = rootView.findViewById(I1.b.f3818i0);
            AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.switch_item)");
            this.f8905h = (SwitchCompat) findViewById2;
            View findViewById3 = rootView.findViewById(I1.b.f3757I);
            AbstractC3159y.h(findViewById3, "rootView.findViewById(R.id.line_item)");
            this.f8906i = findViewById3;
        }

        public static final void a(e this$0, R7.d switchItem, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(switchItem, "$switchItem");
            this$0.f8898a.b(switchItem);
        }

        public static final void b(R7.d switchItem, e this$0, String tag, CompoundButton compoundButton, boolean z8) {
            AbstractC3159y.i(switchItem, "$switchItem");
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(tag, "$tag");
            switchItem.f8913b = Boolean.valueOf(z8);
            this$0.f8898a.d(switchItem);
            boolean z9 = switchItem.f8916e;
            SwitchCompat switchCompat = this$0.f8905h;
            if (switchCompat.isChecked() || !z9) {
                tag = "";
            }
            switchCompat.setText(tag);
        }

        public final void c(final R7.d switchItem, final String tag) {
            boolean booleanValue;
            String str;
            AbstractC3159y.i(switchItem, "switchItem");
            AbstractC3159y.i(tag, "tag");
            TextView textView = this.f8904g;
            String name = switchItem.f8912a.f1048b;
            Integer num = switchItem.f8918g;
            String noun = switchItem.f8917f;
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(noun, "noun");
            if (num != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" (");
                sb.append(num);
                sb.append(' ');
                String lowerCase = noun.toLowerCase(Locale.ROOT);
                AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                sb.append(lowerCase);
                sb.append(')');
                name = sb.toString();
            }
            textView.setText(name);
            Integer num2 = this.f8899b;
            if (num2 != null) {
                textView.setTextColor(num2.intValue());
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: R7.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.e.a(a.e.this, switchItem, view);
                }
            });
            Typeface typeface = this.f8903f;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            SwitchCompat switchCompat = this.f8905h;
            if (switchItem.f8913b == null) {
                switchCompat.setVisibility(8);
            } else {
                switchCompat.setVisibility(0);
                Boolean bool = switchItem.f8913b;
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                switchCompat.setChecked(booleanValue);
            }
            switchCompat.setContentDescription(switchItem.f8912a.f1048b);
            boolean z8 = switchItem.f8916e;
            SwitchCompat switchCompat2 = this.f8905h;
            if (!switchCompat2.isChecked() && z8) {
                str = tag;
            } else {
                str = "";
            }
            switchCompat2.setText(str);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: R7.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                    a.e.b(d.this, this, tag, compoundButton, z9);
                }
            });
            Integer num3 = this.f8900c;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = this.f8901d;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{intValue, intValue2}));
                    switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{ColorUtils.setAlphaComponent(intValue, 128), ColorUtils.setAlphaComponent(intValue2, 128)}));
                }
            }
            Integer num5 = this.f8899b;
            if (num5 != null) {
                switchCompat.setTextColor(num5.intValue());
            }
            Typeface typeface2 = this.f8903f;
            if (typeface2 != null) {
                switchCompat.setTypeface(typeface2);
            }
            Integer num6 = this.f8902e;
            if (num6 != null) {
                this.f8906i.setBackgroundColor(num6.intValue());
            }
        }
    }

    public /* synthetic */ a(List list, b bVar, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2, int i8) {
        this(list, bVar, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? null : num2, (i8 & 64) != 0 ? null : num3, (i8 & 128) != 0 ? null : num4, (i8 & 256) != 0 ? null : typeface, (i8 & 512) != 0 ? null : typeface2);
    }

    public final void a() {
        this.f8874a.add(0, new R7.d(new B6.f(0, null, 3), null, f.DESCRIPTION, null, false, null, null, 122));
    }

    public final void b(List switchItems, boolean z8) {
        AbstractC3159y.i(switchItems, "switchItems");
        this.f8874a = switchItems;
        if (!z8) {
            a();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8874a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((R7.d) this.f8874a.get(i8)).f8914c.f8939a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).c((R7.d) this.f8874a.get(i8), this.f8877d);
            return;
        }
        if (holder instanceof c) {
            c cVar = (c) holder;
            String descriptionText = this.f8876c;
            cVar.getClass();
            AbstractC3159y.i(descriptionText, "descriptionText");
            TextView textView = cVar.f8892d;
            textView.setText(descriptionText);
            Integer num = cVar.f8889a;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = cVar.f8891c;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            Integer num2 = cVar.f8890b;
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
            String labelText = ((R7.d) this.f8874a.get(i8)).f8917f;
            dVar.getClass();
            AbstractC3159y.i(labelText, "labelText");
            TextView textView2 = dVar.f8896d;
            textView2.setText(labelText);
            Integer num3 = dVar.f8893a;
            if (num3 != null) {
                textView2.setTextColor(num3.intValue());
            }
            Typeface typeface2 = dVar.f8895c;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
            }
            Integer num4 = dVar.f8894b;
            if (num4 != null) {
                dVar.f8897e.setBackgroundColor(num4.intValue());
                return;
            }
            return;
        }
        if (holder instanceof C0182a) {
            C0182a c0182a = (C0182a) holder;
            String labelText2 = ((R7.d) this.f8874a.get(i8)).f8917f;
            c0182a.getClass();
            AbstractC3159y.i(labelText2, "labelText");
            TextView textView3 = c0182a.f8887d;
            textView3.setText(labelText2);
            Integer num5 = c0182a.f8884a;
            if (num5 != null) {
                textView3.setTextColor(num5.intValue());
            }
            Typeface typeface3 = c0182a.f8886c;
            if (typeface3 != null) {
                textView3.setTypeface(typeface3);
            }
            Integer num6 = c0182a.f8885b;
            if (num6 != null) {
                c0182a.f8888e.setBackgroundColor(num6.intValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        if (i8 == 1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3881s, parent, false);
            AbstractC3159y.h(view, "view");
            return new c(view, this.f8878e, this.f8881h, this.f8883j);
        }
        if (i8 == 2) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3882t, parent, false);
            AbstractC3159y.h(view2, "view");
            return new d(view2, this.f8878e, this.f8881h, this.f8882i);
        }
        if (i8 == 3) {
            View view3 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3878p, parent, false);
            AbstractC3159y.h(view3, "view");
            return new C0182a(view3, this.f8878e, this.f8881h, this.f8883j);
        }
        View view4 = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3880r, parent, false);
        AbstractC3159y.h(view4, "view");
        return new e(view4, this.f8875b, this.f8878e, this.f8879f, this.f8880g, this.f8881h, this.f8883j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof e) {
            ((e) holder).f8905h.setOnCheckedChangeListener(null);
        }
        super.onViewRecycled(holder);
    }

    public a(List switchItems, b listener, String descriptionItemText, String switchTagText, Integer num, Integer num2, Integer num3, Integer num4, Typeface typeface, Typeface typeface2) {
        AbstractC3159y.i(switchItems, "switchItems");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(descriptionItemText, "descriptionItemText");
        AbstractC3159y.i(switchTagText, "switchTagText");
        this.f8874a = switchItems;
        this.f8875b = listener;
        this.f8876c = descriptionItemText;
        this.f8877d = switchTagText;
        this.f8878e = num;
        this.f8879f = num2;
        this.f8880g = num3;
        this.f8881h = num4;
        this.f8882i = typeface;
        this.f8883j = typeface2;
        if (descriptionItemText.length() > 0) {
            a();
        }
    }
}
