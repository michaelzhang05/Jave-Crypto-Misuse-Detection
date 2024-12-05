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
import c.C1895i;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3632f extends Q7.a {

    /* renamed from: x, reason: collision with root package name */
    public static final a f37149x = new a();

    /* renamed from: y, reason: collision with root package name */
    public static final String f37150y;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f37151m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f37152n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f37153o;

    /* renamed from: p, reason: collision with root package name */
    public Button f37154p;

    /* renamed from: q, reason: collision with root package name */
    public Button f37155q;

    /* renamed from: r, reason: collision with root package name */
    public CardView f37156r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f37157s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f37158t;

    /* renamed from: u, reason: collision with root package name */
    public NestedScrollView f37159u;

    /* renamed from: v, reason: collision with root package name */
    public P7.f f37160v;

    /* renamed from: w, reason: collision with root package name */
    public C3639m f37161w;

    /* renamed from: q.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        String simpleName = C3632f.class.getSimpleName();
        AbstractC3159y.h(simpleName, "MSPAPrivacyFragment::class.java.simpleName");
        f37150y = simpleName;
    }

    public static final void l(C3632f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void m(C3632f this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void n(C3632f this$0, String link, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(link, "$link");
        this$0.getClass();
        try {
            if (link.length() > 0) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(link));
                this$0.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(f37150y, "No a valid URL has been passed");
        }
    }

    public static final void o(final C3632f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3639m c3639m = this$0.f37161w;
        if (c3639m == null) {
            AbstractC3159y.y("mspaViewModel");
            c3639m = null;
        }
        c3639m.a().observe(this$0, new Observer() { // from class: q.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3632f.m(C3632f.this, (String) obj);
            }
        });
    }

    public static final void p(C3632f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new C3638l(), C3638l.f37168B)) != null) {
            add.commit();
        }
    }

    public final void k(TextView textView, final String str, String str2, boolean z8) {
        if (textView != null) {
            textView.setText(str2);
            H5.a.a(textView, z8);
            textView.setOnClickListener(new View.OnClickListener() { // from class: q.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3632f.n(C3632f.this, str, view);
                }
            });
        }
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
            this.f37160v = (P7.f) new ViewModelProvider(viewModelStore, new P7.g()).get(P7.f.class);
            ViewModelStore viewModelStore2 = getViewModelStore();
            AbstractC3159y.h(viewModelStore2, "viewModelStore");
            this.f37161w = (C3639m) new ViewModelProvider(viewModelStore2, new C3642p()).get(C3639m.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3868f, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…rivacy, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List list;
        TextView textView;
        String str;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f37151m = (LinearLayout) view.findViewById(I1.b.f3841q);
        this.f37152n = (TextView) view.findViewById(I1.b.f3792Z0);
        this.f37153o = (TextView) view.findViewById(I1.b.f3856w0);
        this.f37158t = (TextView) view.findViewById(I1.b.f3839p0);
        this.f37156r = (CardView) view.findViewById(I1.b.f3793a);
        this.f37157s = (TextView) view.findViewById(I1.b.f3842q0);
        this.f37159u = (NestedScrollView) view.findViewById(I1.b.f3815h0);
        this.f37154p = (Button) view.findViewById(I1.b.f3820j);
        this.f37155q = (Button) view.findViewById(I1.b.f3805e);
        C3639m c3639m = this.f37161w;
        C3639m c3639m2 = null;
        if (c3639m == null) {
            AbstractC3159y.y("mspaViewModel");
            c3639m = null;
        }
        C6.i.f1350a.c(c3639m.f37183a);
        TextView textView2 = this.f8374b;
        if (textView2 != null) {
            P7.f fVar = this.f37160v;
            if (fVar == null) {
                AbstractC3159y.y("ccpaViewModel");
                fVar = null;
            }
            String str2 = fVar.f8130c.f5535a;
            if (str2.length() == 0) {
                str2 = getString(I1.e.f3891c);
                AbstractC3159y.h(str2, "getString(R.string.ccpa_privacy_title)");
            }
            textView2.setText(str2);
        }
        P7.f fVar2 = this.f37160v;
        if (fVar2 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar2 = null;
        }
        if (fVar2.d().length() > 0) {
            TextView textView3 = this.f37157s;
            if (textView3 != null) {
                P7.f fVar3 = this.f37160v;
                if (fVar3 == null) {
                    AbstractC3159y.y("ccpaViewModel");
                    fVar3 = null;
                }
                textView3.setText(K5.a.a(fVar3.d()));
            }
        } else {
            TextView textView4 = this.f37157s;
            if (textView4 != null) {
                textView4.setText(I1.e.f3890b);
            }
        }
        TextView textView5 = this.f37157s;
        if (textView5 != null) {
            P7.f fVar4 = this.f37160v;
            if (fVar4 == null) {
                AbstractC3159y.y("ccpaViewModel");
                fVar4 = null;
            }
            fVar4.getClass();
            if (C1895i.f14840b) {
                str = fVar4.f8133f.f3216b.f3211c;
            } else {
                str = "";
            }
            textView5.append(str);
        }
        TextView textView6 = this.f37157s;
        if (textView6 != null) {
            textView6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.f37157s) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, I1.a.f3736b));
        }
        LinearLayout linearLayout = this.f37151m;
        if (linearLayout != null) {
            P7.f fVar5 = this.f37160v;
            if (fVar5 == null) {
                AbstractC3159y.y("ccpaViewModel");
                fVar5 = null;
            }
            H5.a.a(linearLayout, fVar5.e());
        }
        TextView textView7 = this.f37153o;
        P7.f fVar6 = this.f37160v;
        if (fVar6 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar6 = null;
        }
        String f8 = fVar6.f();
        P7.f fVar7 = this.f37160v;
        if (fVar7 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar7 = null;
        }
        String g8 = fVar7.g();
        P7.f fVar8 = this.f37160v;
        if (fVar8 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar8 = null;
        }
        k(textView7, f8, g8, fVar8.h());
        TextView textView8 = this.f37158t;
        P7.f fVar9 = this.f37160v;
        if (fVar9 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar9 = null;
        }
        String a8 = fVar9.a();
        P7.f fVar10 = this.f37160v;
        if (fVar10 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar10 = null;
        }
        String b8 = fVar10.b();
        P7.f fVar11 = this.f37160v;
        if (fVar11 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar11 = null;
        }
        k(textView8, a8, b8, fVar11.c());
        TextView textView9 = this.f37152n;
        P7.f fVar12 = this.f37160v;
        if (fVar12 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar12 = null;
        }
        String i8 = fVar12.i();
        P7.f fVar13 = this.f37160v;
        if (fVar13 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar13 = null;
        }
        String j8 = fVar13.j();
        P7.f fVar14 = this.f37160v;
        if (fVar14 == null) {
            AbstractC3159y.y("ccpaViewModel");
            fVar14 = null;
        }
        k(textView9, i8, j8, fVar14.k());
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3632f.l(C3632f.this, view2);
                }
            });
            P7.f fVar15 = this.f37160v;
            if (fVar15 == null) {
                AbstractC3159y.y("ccpaViewModel");
                fVar15 = null;
            }
            imageView.setContentDescription(fVar15.f8130c.f5540f);
        }
        Button button = this.f37155q;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3632f.o(C3632f.this, view2);
                }
            });
        }
        Button button2 = this.f37154p;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3632f.p(C3632f.this, view2);
                }
            });
        }
        J7.c cVar = this.f8382j;
        if (cVar != null) {
            Integer num = cVar.f5549g;
            if (num != null) {
                int intValue = num.intValue();
                view.setBackgroundColor(intValue);
                CardView cardView = this.f37156r;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f5543a;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.f37159u;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, intValue2);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = cVar.f5551i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView10 = this.f37157s;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f5554l;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                TextView textView11 = this.f37157s;
                if (textView11 != null) {
                    textView11.setLinkTextColor(intValue4);
                }
                TextView textView12 = this.f37158t;
                if (textView12 != null) {
                    textView12.setTextColor(intValue4);
                }
                TextView textView13 = this.f37153o;
                if (textView13 != null) {
                    textView13.setTextColor(intValue4);
                }
                TextView textView14 = this.f37152n;
                if (textView14 != null) {
                    textView14.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f5557o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f37154p;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f37155q;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f5555m;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f37154p;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
                Button button6 = this.f37155q;
                if (button6 != null) {
                    button6.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f8384l;
        if (typeface != null) {
            TextView textView15 = this.f37157s;
            if (textView15 != null) {
                textView15.setTypeface(typeface);
            }
            TextView textView16 = this.f37158t;
            if (textView16 != null) {
                textView16.setTypeface(typeface);
            }
            TextView textView17 = this.f37153o;
            if (textView17 != null) {
                textView17.setTypeface(typeface);
            }
            TextView textView18 = this.f37152n;
            if (textView18 != null) {
                textView18.setTypeface(typeface);
            }
            Button button7 = this.f37155q;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f37154p;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        C3639m c3639m3 = this.f37161w;
        if (c3639m3 == null) {
            AbstractC3159y.y("mspaViewModel");
        } else {
            c3639m2 = c3639m3;
        }
        c3639m2.getClass();
        if (!C6.i.f1354e && (list = c3639m2.f37183a.f1301d) != null) {
            C6.d.f1320a.b(list, true, new C3640n(c3639m2));
        }
        C6.i.f1354e = true;
        SharedStorage m8 = O7.d.f7806a.m();
        N7.a preferenceKey = N7.a.MSPA_SHOWN;
        m8.getClass();
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = m8.f17845a.edit();
        AbstractC3159y.h(editor, "editor");
        editor.putBoolean("MSPAShown", true);
        editor.apply();
    }
}
