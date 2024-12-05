package c;

import R7.a;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889c extends Q7.a implements a.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f14819q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f14820r;

    /* renamed from: m, reason: collision with root package name */
    public TextView f14821m;

    /* renamed from: n, reason: collision with root package name */
    public Button f14822n;

    /* renamed from: o, reason: collision with root package name */
    public NestedScrollView f14823o;

    /* renamed from: p, reason: collision with root package name */
    public C1891e f14824p;

    /* renamed from: c.c$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        String simpleName = C1889c.class.getSimpleName();
        AbstractC3159y.h(simpleName, "GBCFragment::class.java.simpleName");
        f14820r = simpleName;
    }

    public static final void k(C1889c this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void l(C1889c this$0, View view) {
        C1893g c1893g;
        AbstractC3159y.i(this$0, "this$0");
        Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1893g.f14831h);
        if (findFragmentByTag instanceof C1893g) {
            c1893g = (C1893g) findFragmentByTag;
        } else {
            c1893g = null;
        }
        if (c1893g != null) {
            c1893g.h();
        }
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // R7.a.b
    public void b(R7.d item) {
        AbstractC3159y.i(item, "item");
    }

    @Override // R7.a.b
    public void d(R7.d item) {
        AbstractC3159y.i(item, "item");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        AbstractC3159y.i(dialog, "dialog");
        super.onCancel(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f14824p = (C1891e) new ViewModelProvider(viewModelStore, new C1892f()).get(C1891e.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3874l, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…screen, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f14821m = (TextView) view.findViewById(I1.b.f3764L0);
        this.f14822n = (Button) view.findViewById(I1.b.f3826l);
        this.f14823o = (NestedScrollView) view.findViewById(I1.b.f3815h0);
        C1891e c1891e = null;
        getChildFragmentManager().beginTransaction().add(I1.b.f3861z, new C1893g(), C1893g.f14831h).addToBackStack(null).commit();
        TextView textView3 = this.f8374b;
        if (textView3 != null) {
            C1891e c1891e2 = this.f14824p;
            if (c1891e2 == null) {
                AbstractC3159y.y("viewModel");
                c1891e2 = null;
            }
            String str = c1891e2.f14828c.f3216b.f3209a;
            if (str.length() == 0) {
                str = getString(I1.e.f3904p);
                AbstractC3159y.h(str, "getString(R.string.we_value_your_privacy)");
            }
            textView3.setText(str);
        }
        TextView textView4 = this.f14821m;
        if (textView4 != null) {
            C1891e c1891e3 = this.f14824p;
            if (c1891e3 == null) {
                AbstractC3159y.y("viewModel");
                c1891e3 = null;
            }
            String str2 = c1891e3.f14828c.f3216b.f3211c;
            if (str2.length() == 0) {
                str2 = getString(I1.e.f3894f);
                AbstractC3159y.h(str2, "getString(R.string.gbc_description)");
            }
            textView4.setText(str2);
        }
        TextView textView5 = this.f14821m;
        if (textView5 != null) {
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView2 = this.f14821m) != null) {
            textView2.setLinkTextColor(ContextCompat.getColor(context, I1.a.f3736b));
        }
        Button button = this.f14822n;
        if (button != null) {
            C1891e c1891e4 = this.f14824p;
            if (c1891e4 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                c1891e = c1891e4;
            }
            String str3 = c1891e.f14828c.f3216b.f3212d;
            if (str3.length() == 0) {
                str3 = getString(I1.e.f3902n);
                AbstractC3159y.h(str3, "getString(R.string.save_and_exit)");
            }
            button.setText(str3);
        }
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: c.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1889c.k(C1889c.this, view2);
                }
            });
        }
        Button button2 = this.f14822n;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: c.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1889c.l(C1889c.this, view2);
                }
            });
        }
        J7.c cVar = this.f8382j;
        if (cVar != null) {
            Integer num = cVar.f5549g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f5543a;
            if (num2 != null) {
                int intValue = num2.intValue();
                NestedScrollView nestedScrollView = this.f14823o;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f5551i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView6 = this.f14821m;
                if (textView6 != null) {
                    textView6.setTextColor(intValue2);
                }
            }
            Integer num4 = cVar.f5557o;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                Button button3 = this.f14822n;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue3);
                }
            }
            Integer num5 = cVar.f5555m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button4 = this.f14822n;
                if (button4 != null) {
                    button4.setTextColor(intValue4);
                }
            }
        }
        Typeface typeface = this.f8384l;
        if (typeface != null && (textView = this.f14821m) != null) {
            textView.setTypeface(typeface);
        }
    }
}
