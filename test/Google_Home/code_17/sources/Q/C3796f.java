package q;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import c.C2001i;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3796f extends T7.a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f38010x = new a();

    /* renamed from: y, reason: collision with root package name */
    public static final String f38011y;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f38012m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f38013n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f38014o;

    /* renamed from: p, reason: collision with root package name */
    public Button f38015p;

    /* renamed from: q, reason: collision with root package name */
    public Button f38016q;

    /* renamed from: r, reason: collision with root package name */
    public CardView f38017r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f38018s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f38019t;

    /* renamed from: u, reason: collision with root package name */
    public NestedScrollView f38020u;

    /* renamed from: v, reason: collision with root package name */
    public S7.f f38021v;

    /* renamed from: w, reason: collision with root package name */
    public C3803m f38022w;

    /* renamed from: q.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        String simpleName = C3796f.class.getSimpleName();
        AbstractC3255y.h(simpleName, "MSPAPrivacyFragment::class.java.simpleName");
        f38011y = simpleName;
    }

    public static final void l(C3796f this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void m(C3796f this$0, String str) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void n(C3796f this$0, String link, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(link, "$link");
        this$0.getClass();
        try {
            if (link.length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(link));
                this$0.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(f38011y, "No a valid URL has been passed");
        }
    }

    public static final void o(final C3796f this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3803m c3803m = this$0.f38022w;
        if (c3803m == null) {
            AbstractC3255y.y("mspaViewModel");
            c3803m = null;
        }
        c3803m.a().observe(this$0, new Observer() { // from class: q.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3796f.m(C3796f.this, (String) obj);
            }
        });
    }

    public static final void p(C3796f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3255y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3802l(), C3802l.f38029B)) != null) {
            add.commit();
        }
    }

    public final void k(TextView textView, final String str, String str2, boolean z8) {
        if (textView != null) {
            textView.setText(str2);
            K5.a.a(textView, z8);
            textView.setOnClickListener(new View.OnClickListener() { // from class: q.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3796f.n(C3796f.this, str, view);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        AbstractC3255y.i(dialog, "dialog");
        super.onCancel(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f38021v = (S7.f) new ViewModelProvider(viewModelStore, new S7.g()).get(S7.f.class);
            ViewModelStore viewModelStore2 = getViewModelStore();
            AbstractC3255y.h(viewModelStore2, "viewModelStore");
            this.f38022w = (C3803m) new ViewModelProvider(viewModelStore2, new C3806p()).get(C3803m.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5863f, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…rivacy, container, false)");
        return inflate;
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List list;
        TextView textView;
        String str;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f38012m = (LinearLayout) view.findViewById(L1.b.f5836q);
        this.f38013n = (TextView) view.findViewById(L1.b.f5787Z0);
        this.f38014o = (TextView) view.findViewById(L1.b.f5851w0);
        this.f38019t = (TextView) view.findViewById(L1.b.f5834p0);
        this.f38017r = (CardView) view.findViewById(L1.b.f5788a);
        this.f38018s = (TextView) view.findViewById(L1.b.f5837q0);
        this.f38020u = (NestedScrollView) view.findViewById(L1.b.f5810h0);
        this.f38015p = (Button) view.findViewById(L1.b.f5815j);
        this.f38016q = (Button) view.findViewById(L1.b.f5800e);
        C3803m c3803m = this.f38022w;
        C3803m c3803m2 = null;
        if (c3803m == null) {
            AbstractC3255y.y("mspaViewModel");
            c3803m = null;
        }
        F6.i.f2860a.c(c3803m.f38044a);
        TextView textView2 = this.f10171b;
        if (textView2 != null) {
            S7.f fVar = this.f38021v;
            if (fVar == null) {
                AbstractC3255y.y("ccpaViewModel");
                fVar = null;
            }
            String str2 = fVar.f9961c.f7241a;
            if (str2.length() == 0) {
                str2 = getString(L1.e.f5886c);
                AbstractC3255y.h(str2, "getString(R.string.ccpa_privacy_title)");
            }
            textView2.setText(str2);
        }
        S7.f fVar2 = this.f38021v;
        if (fVar2 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar2 = null;
        }
        if (fVar2.d().length() > 0) {
            TextView textView3 = this.f38018s;
            if (textView3 != null) {
                S7.f fVar3 = this.f38021v;
                if (fVar3 == null) {
                    AbstractC3255y.y("ccpaViewModel");
                    fVar3 = null;
                }
                textView3.setText(N5.a.a(fVar3.d()));
            }
        } else {
            TextView textView4 = this.f38018s;
            if (textView4 != null) {
                textView4.setText(L1.e.f5885b);
            }
        }
        TextView textView5 = this.f38018s;
        if (textView5 != null) {
            S7.f fVar4 = this.f38021v;
            if (fVar4 == null) {
                AbstractC3255y.y("ccpaViewModel");
                fVar4 = null;
            }
            fVar4.getClass();
            if (C2001i.f15552b) {
                str = fVar4.f9964f.f4935b.f4930c;
            } else {
                str = "";
            }
            textView5.append(str);
        }
        TextView textView6 = this.f38018s;
        if (textView6 != null) {
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f38018s) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, L1.a.f5731b));
        }
        LinearLayout linearLayout = this.f38012m;
        if (linearLayout != null) {
            S7.f fVar5 = this.f38021v;
            if (fVar5 == null) {
                AbstractC3255y.y("ccpaViewModel");
                fVar5 = null;
            }
            K5.a.a(linearLayout, fVar5.e());
        }
        TextView textView7 = this.f38014o;
        S7.f fVar6 = this.f38021v;
        if (fVar6 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar6 = null;
        }
        String f8 = fVar6.f();
        S7.f fVar7 = this.f38021v;
        if (fVar7 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar7 = null;
        }
        String g8 = fVar7.g();
        S7.f fVar8 = this.f38021v;
        if (fVar8 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar8 = null;
        }
        k(textView7, f8, g8, fVar8.h());
        TextView textView8 = this.f38019t;
        S7.f fVar9 = this.f38021v;
        if (fVar9 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar9 = null;
        }
        String a8 = fVar9.a();
        S7.f fVar10 = this.f38021v;
        if (fVar10 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar10 = null;
        }
        String b8 = fVar10.b();
        S7.f fVar11 = this.f38021v;
        if (fVar11 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar11 = null;
        }
        k(textView8, a8, b8, fVar11.c());
        TextView textView9 = this.f38013n;
        S7.f fVar12 = this.f38021v;
        if (fVar12 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar12 = null;
        }
        String i8 = fVar12.i();
        S7.f fVar13 = this.f38021v;
        if (fVar13 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar13 = null;
        }
        String j8 = fVar13.j();
        S7.f fVar14 = this.f38021v;
        if (fVar14 == null) {
            AbstractC3255y.y("ccpaViewModel");
            fVar14 = null;
        }
        k(textView9, i8, j8, fVar14.k());
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3796f.l(C3796f.this, view2);
                }
            });
            S7.f fVar15 = this.f38021v;
            if (fVar15 == null) {
                AbstractC3255y.y("ccpaViewModel");
                fVar15 = null;
            }
            imageView.setContentDescription(fVar15.f9961c.f7246f);
        }
        Button button = this.f38016q;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3796f.o(C3796f.this, view2);
                }
            });
        }
        Button button2 = this.f38015p;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3796f.p(C3796f.this, view2);
                }
            });
        }
        M7.c cVar = this.f10179j;
        if (cVar != null) {
            Integer num = cVar.f7255g;
            if (num != null) {
                int intValue = num.intValue();
                view.setBackgroundColor(intValue);
                CardView cardView = this.f38017r;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f7249a;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.f38020u;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue2);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f7257i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView10 = this.f38018s;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f7260l;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                TextView textView11 = this.f38018s;
                if (textView11 != null) {
                    textView11.setLinkTextColor(intValue4);
                }
                TextView textView12 = this.f38019t;
                if (textView12 != null) {
                    textView12.setTextColor(intValue4);
                }
                TextView textView13 = this.f38014o;
                if (textView13 != null) {
                    textView13.setTextColor(intValue4);
                }
                TextView textView14 = this.f38013n;
                if (textView14 != null) {
                    textView14.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f7263o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f38015p;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f38016q;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f7261m;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f38015p;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
                Button button6 = this.f38016q;
                if (button6 != null) {
                    button6.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f10181l;
        if (typeface != null) {
            TextView textView15 = this.f38018s;
            if (textView15 != null) {
                textView15.setTypeface(typeface);
            }
            TextView textView16 = this.f38019t;
            if (textView16 != null) {
                textView16.setTypeface(typeface);
            }
            TextView textView17 = this.f38014o;
            if (textView17 != null) {
                textView17.setTypeface(typeface);
            }
            TextView textView18 = this.f38013n;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            Button button7 = this.f38016q;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f38015p;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        C3803m c3803m3 = this.f38022w;
        if (c3803m3 == null) {
            AbstractC3255y.y("mspaViewModel");
        } else {
            c3803m2 = c3803m3;
        }
        c3803m2.getClass();
        if (!F6.i.f2864e && (list = c3803m2.f38044a.f2811d) != null) {
            F6.d.f2830a.b(list, true, new C3804n(c3803m2));
        }
        F6.i.f2864e = true;
        SharedStorage m8 = R7.d.f9662a.m();
        Q7.a preferenceKey = Q7.a.MSPA_SHOWN;
        m8.getClass();
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = m8.f18900a.edit();
        AbstractC3255y.h(editor, "editor");
        editor.putBoolean("MSPAShown", true);
        editor.apply();
    }
}
