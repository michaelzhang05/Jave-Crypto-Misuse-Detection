package z5;

import B6.i;
import H7.m;
import M5.AbstractC1246t;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import w5.C3851a;

/* loaded from: classes5.dex */
public final class f extends Q7.a {

    /* renamed from: H, reason: collision with root package name */
    public static final a f40450H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final String f40451I;

    /* renamed from: A, reason: collision with root package name */
    public TextView f40452A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f40453B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f40454C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f40455D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f40456E;

    /* renamed from: F, reason: collision with root package name */
    public C4027a f40457F;

    /* renamed from: G, reason: collision with root package name */
    public g f40458G;

    /* renamed from: m, reason: collision with root package name */
    public TextView f40459m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f40460n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f40461o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f40462p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f40463q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f40464r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f40465s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f40466t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f40467u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f40468v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f40469w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f40470x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f40471y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f40472z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3159y.h(simpleName, "PartnersDetailFragment::class.java.simpleName");
        f40451I = simpleName;
    }

    public static final void n(f this$0, J7.d cookieDisclosure) {
        g gVar;
        Iterator it;
        Map map;
        i iVar;
        AbstractC3159y.i(this$0, "this$0");
        g gVar2 = this$0.f40458G;
        if (gVar2 == null) {
            AbstractC3159y.y("viewModel");
            gVar2 = null;
        }
        AbstractC3159y.h(cookieDisclosure, "it");
        gVar2.getClass();
        AbstractC3159y.i(cookieDisclosure, "cookieDisclosure");
        gVar2.f40476d.clear();
        Iterator it2 = cookieDisclosure.f5559a.iterator();
        while (it2.hasNext()) {
            J7.f fVar = (J7.f) it2.next();
            List list = gVar2.f40476d;
            String str = fVar.f5610a;
            String str2 = fVar.f5611b;
            String valueOf = String.valueOf(fVar.f5612c);
            String str3 = fVar.f5613d;
            List list2 = fVar.f5614e;
            String str4 = "";
            int i8 = 0;
            for (Object obj : list2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1246t.w();
                }
                int intValue = ((Number) obj).intValue();
                B6.e eVar = gVar2.f40473a.f39932a;
                if (eVar == null || (map = eVar.f1038d) == null || (iVar = (i) map.get(String.valueOf(intValue))) == null) {
                    it = it2;
                } else {
                    Y y8 = Y.f33766a;
                    it = it2;
                    String format = String.format("• %s.", Arrays.copyOf(new Object[]{iVar.f1048b}, 1));
                    AbstractC3159y.h(format, "format(format, *args)");
                    str4 = AbstractC3159y.q(str4, format);
                    if (i8 != list2.size() - 1) {
                        str4 = AbstractC3159y.q(str4, "\n");
                    }
                }
                it2 = it;
                i8 = i9;
            }
            list.add(new Q7.e(str, str2, valueOf, str3, str4));
        }
        g gVar3 = this$0.f40458G;
        if (gVar3 == null) {
            AbstractC3159y.y("viewModel");
            gVar3 = null;
        }
        if (!gVar3.f40476d.isEmpty()) {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str5 = w5.e.f39056p;
                if (supportFragmentManager.findFragmentByTag(str5) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    g gVar4 = this$0.f40458G;
                    if (gVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar = null;
                    } else {
                        gVar = gVar4;
                    }
                    C3851a args = new C3851a(gVar.f40476d);
                    AbstractC3159y.i(args, "args");
                    w5.e eVar2 = new w5.e();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("partner_disclosure_args", args);
                    eVar2.setArguments(bundle);
                    beginTransaction.add(eVar2, str5).commit();
                    return;
                }
                return;
            }
            return;
        }
        this$0.r();
    }

    public static final void o(f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        m mVar = m.f3657a;
        StringBuilder sb = new StringBuilder();
        g gVar = this$0.f40458G;
        C4027a c4027a = null;
        if (gVar == null) {
            AbstractC3159y.y("viewModel");
            gVar = null;
        }
        C4027a c4027a2 = this$0.f40457F;
        if (c4027a2 == null) {
            AbstractC3159y.y("args");
            c4027a2 = null;
        }
        sb.append(H7.b.a(gVar.a(c4027a2.f40442n)));
        sb.append("-id:");
        C4027a c4027a3 = this$0.f40457F;
        if (c4027a3 == null) {
            AbstractC3159y.y("args");
        } else {
            c4027a = c4027a3;
        }
        sb.append(c4027a.f40441m);
        mVar.f("collapseElement", sb.toString());
        this$0.dismiss();
    }

    public static final void p(f this$0, String link, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(link, "$link");
        Context context = this$0.getContext();
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(link));
            context.startActivity(intent);
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C4027a c4027a = this$0.f40457F;
        C4027a c4027a2 = null;
        if (c4027a == null) {
            AbstractC3159y.y("args");
            c4027a = null;
        }
        if (c4027a.f40443o.length() > 0) {
            g gVar = this$0.f40458G;
            if (gVar == null) {
                AbstractC3159y.y("viewModel");
                gVar = null;
            }
            C4027a c4027a3 = this$0.f40457F;
            if (c4027a3 == null) {
                AbstractC3159y.y("args");
            } else {
                c4027a2 = c4027a3;
            }
            String url = c4027a2.f40443o;
            gVar.getClass();
            AbstractC3159y.i(url, "url");
            gVar.f40474b.a(url).observe(this$0, new Observer() { // from class: z5.e
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    f.n(f.this, (J7.d) obj);
                }
            });
            return;
        }
        this$0.r();
    }

    public final void k(View view) {
        this.f40456E = (ImageView) view.findViewById(I1.b.f3827l0);
        this.f40455D = (TextView) view.findViewById(I1.b.f3758I0);
        this.f40454C = (TextView) view.findViewById(I1.b.f3858x0);
        this.f40453B = (TextView) view.findViewById(I1.b.f3798b1);
        this.f40452A = (TextView) view.findViewById(I1.b.f3770O0);
        this.f40472z = (TextView) view.findViewById(I1.b.f3819i1);
        this.f40471y = (TextView) view.findViewById(I1.b.f3760J0);
        this.f40470x = (TextView) view.findViewById(I1.b.f3813g1);
        this.f40469w = (TextView) view.findViewById(I1.b.f3801c1);
        this.f40468v = (TextView) view.findViewById(I1.b.f3772P0);
        this.f40467u = (TextView) view.findViewById(I1.b.f3825k1);
        this.f40466t = (TextView) view.findViewById(I1.b.f3762K0);
        this.f40465s = (TextView) view.findViewById(I1.b.f3816h1);
        this.f40464r = (TextView) view.findViewById(I1.b.f3848s0);
        this.f40462p = (TextView) view.findViewById(I1.b.f3846r1);
        this.f40463q = (TextView) view.findViewById(I1.b.f3854v0);
        this.f40461o = (TextView) view.findViewById(I1.b.f3850t0);
        this.f40460n = (TextView) view.findViewById(I1.b.f3852u0);
        this.f40459m = (TextView) view.findViewById(I1.b.f3792Z0);
        ImageView imageView = this.f40456E;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: z5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.o(f.this, view2);
                }
            });
            g gVar = this.f40458G;
            if (gVar == null) {
                AbstractC3159y.y("viewModel");
                gVar = null;
            }
            imageView.setContentDescription(gVar.f40475c.g().f5679o);
        }
        TextView textView = this.f40455D;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: z5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.q(f.this, view2);
                }
            });
        }
        J7.c cVar = this.f8382j;
        if (cVar != null) {
            Integer num = cVar.f5549g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f5551i;
            if (num2 != null) {
                int intValue = num2.intValue();
                TextView textView2 = this.f40454C;
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                }
                TextView textView3 = this.f40453B;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f40452A;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f40472z;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f40471y;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
                TextView textView7 = this.f40470x;
                if (textView7 != null) {
                    textView7.setTextColor(intValue);
                }
                TextView textView8 = this.f40469w;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
                TextView textView9 = this.f40468v;
                if (textView9 != null) {
                    textView9.setTextColor(intValue);
                }
                TextView textView10 = this.f40467u;
                if (textView10 != null) {
                    textView10.setTextColor(intValue);
                }
                TextView textView11 = this.f40466t;
                if (textView11 != null) {
                    textView11.setTextColor(intValue);
                }
                TextView textView12 = this.f40465s;
                if (textView12 != null) {
                    textView12.setTextColor(intValue);
                }
                TextView textView13 = this.f40464r;
                if (textView13 != null) {
                    textView13.setTextColor(intValue);
                }
                TextView textView14 = this.f40462p;
                if (textView14 != null) {
                    textView14.setTextColor(intValue);
                }
                TextView textView15 = this.f40463q;
                if (textView15 != null) {
                    textView15.setTextColor(intValue);
                }
                TextView textView16 = this.f40461o;
                if (textView16 != null) {
                    textView16.setTextColor(intValue);
                }
                TextView textView17 = this.f40460n;
                if (textView17 != null) {
                    textView17.setTextColor(intValue);
                }
            }
            Integer num3 = cVar.f5554l;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView18 = this.f40455D;
                if (textView18 != null) {
                    textView18.setTextColor(intValue2);
                }
                TextView textView19 = this.f40459m;
                if (textView19 != null) {
                    textView19.setTextColor(intValue2);
                }
            }
        }
        Typeface typeface = this.f8383k;
        if (typeface != null) {
            TextView textView20 = this.f40469w;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
            TextView textView21 = this.f40468v;
            if (textView21 != null) {
                textView21.setTypeface(typeface);
            }
            TextView textView22 = this.f40467u;
            if (textView22 != null) {
                textView22.setTypeface(typeface);
            }
            TextView textView23 = this.f40466t;
            if (textView23 != null) {
                textView23.setTypeface(typeface);
            }
            TextView textView24 = this.f40465s;
            if (textView24 != null) {
                textView24.setTypeface(typeface);
            }
            TextView textView25 = this.f40460n;
            if (textView25 != null) {
                textView25.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f8384l;
        if (typeface2 != null) {
            TextView textView26 = this.f40454C;
            if (textView26 != null) {
                textView26.setTypeface(typeface2);
            }
            TextView textView27 = this.f40453B;
            if (textView27 != null) {
                textView27.setTypeface(typeface2);
            }
            TextView textView28 = this.f40452A;
            if (textView28 != null) {
                textView28.setTypeface(typeface2);
            }
            TextView textView29 = this.f40472z;
            if (textView29 != null) {
                textView29.setTypeface(typeface2);
            }
            TextView textView30 = this.f40471y;
            if (textView30 != null) {
                textView30.setTypeface(typeface2);
            }
            TextView textView31 = this.f40470x;
            if (textView31 != null) {
                textView31.setTypeface(typeface2);
            }
            TextView textView32 = this.f40455D;
            if (textView32 != null) {
                textView32.setTypeface(typeface2);
            }
            TextView textView33 = this.f40459m;
            if (textView33 != null) {
                textView33.setTypeface(typeface2);
            }
            TextView textView34 = this.f40464r;
            if (textView34 != null) {
                textView34.setTypeface(typeface2);
            }
            TextView textView35 = this.f40462p;
            if (textView35 != null) {
                textView35.setTypeface(typeface2);
            }
            TextView textView36 = this.f40463q;
            if (textView36 != null) {
                textView36.setTypeface(typeface2);
            }
            TextView textView37 = this.f40461o;
            if (textView37 != null) {
                textView37.setTypeface(typeface2);
            }
        }
    }

    public final void l(TextView textView, TextView textView2, String str, String str2) {
        if (str.length() > 0 && textView != null) {
            textView.setText(str);
        }
        if (str2.length() > 0) {
            if (textView2 != null) {
                textView2.setText(str2);
            }
        } else {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    public final void m(String str, final String str2) {
        TextView textView;
        if (str.length() > 0 && (textView = this.f40459m) != null) {
            textView.setText(str);
        }
        if (URLUtil.isValidUrl(str2)) {
            TextView textView2 = this.f40459m;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: z5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        f.p(f.this, str2, view);
                    }
                });
                return;
            }
            return;
        }
        TextView textView3 = this.f40459m;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C4027a c4027a;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            c4027a = null;
        } else {
            c4027a = (C4027a) arguments.getParcelable("partner_detail_args");
        }
        if (c4027a == null) {
            c4027a = new C4027a(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 65535);
        }
        this.f40457F = c4027a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f40458G = (g) new ViewModelProvider(viewModelStore, new h()).get(g.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3871i, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…detail, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i8 = 0;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = m.f3657a;
        StringBuilder sb = new StringBuilder();
        g gVar = this.f40458G;
        g gVar2 = null;
        if (gVar == null) {
            AbstractC3159y.y("viewModel");
            gVar = null;
        }
        C4027a c4027a = this.f40457F;
        if (c4027a == null) {
            AbstractC3159y.y("args");
            c4027a = null;
        }
        sb.append(H7.b.a(gVar.a(c4027a.f40442n)));
        sb.append("-id:");
        C4027a c4027a2 = this.f40457F;
        if (c4027a2 == null) {
            AbstractC3159y.y("args");
            c4027a2 = null;
        }
        sb.append(c4027a2.f40441m);
        mVar.f("expandElement", sb.toString());
        k(view);
        C4027a c4027a3 = this.f40457F;
        if (c4027a3 == null) {
            AbstractC3159y.y("args");
            c4027a3 = null;
        }
        TextView textView = this.f8374b;
        if (textView != null) {
            textView.setText(c4027a3.f40429a);
        }
        String str = c4027a3.f40430b;
        if (str != null && !AbstractC3159y.d(str, "null")) {
            TextView textView2 = this.f40454C;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f40454C;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        if (c4027a3.f40438j.length() == 0) {
            TextView textView4 = this.f40464r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f40464r;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f40464r;
            if (textView6 != null) {
                Context context = getContext();
                if (context == null) {
                    string = null;
                } else {
                    int i9 = I1.e.f3903o;
                    g gVar3 = this.f40458G;
                    if (gVar3 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar3 = null;
                    }
                    string = context.getString(i9, gVar3.f40475c.g().f5672h, c4027a3.f40438j);
                }
                textView6.setText(string);
            }
        }
        if (c4027a3.f40439k.length() == 0) {
            TextView textView7 = this.f40462p;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        } else {
            TextView textView8 = this.f40462p;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = this.f40462p;
            if (textView9 != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    string2 = null;
                } else {
                    int i10 = I1.e.f3903o;
                    g gVar4 = this.f40458G;
                    if (gVar4 == null) {
                        AbstractC3159y.y("viewModel");
                        gVar4 = null;
                    }
                    string2 = context2.getString(i10, gVar4.f40475c.g().f5676l, c4027a3.f40439k);
                }
                textView9.setText(string2);
            }
        }
        if (c4027a3.f40440l.length() == 0) {
            TextView textView10 = this.f40463q;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
        } else {
            TextView textView11 = this.f40463q;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textView12 = this.f40463q;
            if (textView12 != null) {
                Context context3 = getContext();
                if (context3 == null) {
                    string3 = null;
                } else {
                    string3 = context3.getString(I1.e.f3892d, c4027a3.f40440l);
                }
                textView12.setText(string3);
            }
        }
        TextView textView13 = this.f40455D;
        if (textView13 != null) {
            g gVar5 = this.f40458G;
            if (gVar5 == null) {
                AbstractC3159y.y("viewModel");
                gVar5 = null;
            }
            textView13.setText(gVar5.f40475c.g().f5675k);
        }
        TextView textView14 = this.f40455D;
        if (textView14 != null) {
            if (c4027a3.f40443o.length() <= 0) {
                i8 = 8;
            }
            textView14.setVisibility(i8);
        }
        TextView textView15 = this.f40469w;
        TextView textView16 = this.f40453B;
        g gVar6 = this.f40458G;
        if (gVar6 == null) {
            AbstractC3159y.y("viewModel");
            gVar6 = null;
        }
        l(textView15, textView16, gVar6.f40475c.g().f5665a, c4027a3.f40431c);
        TextView textView17 = this.f40468v;
        TextView textView18 = this.f40452A;
        g gVar7 = this.f40458G;
        if (gVar7 == null) {
            AbstractC3159y.y("viewModel");
            gVar7 = null;
        }
        l(textView17, textView18, gVar7.f40475c.g().f5666b, c4027a3.f40432d);
        TextView textView19 = this.f40467u;
        TextView textView20 = this.f40472z;
        g gVar8 = this.f40458G;
        if (gVar8 == null) {
            AbstractC3159y.y("viewModel");
            gVar8 = null;
        }
        l(textView19, textView20, gVar8.f40475c.g().f5667c, c4027a3.f40433e);
        TextView textView21 = this.f40466t;
        TextView textView22 = this.f40471y;
        g gVar9 = this.f40458G;
        if (gVar9 == null) {
            AbstractC3159y.y("viewModel");
            gVar9 = null;
        }
        l(textView21, textView22, gVar9.f40475c.g().f5668d, c4027a3.f40434f);
        TextView textView23 = this.f40465s;
        TextView textView24 = this.f40470x;
        g gVar10 = this.f40458G;
        if (gVar10 == null) {
            AbstractC3159y.y("viewModel");
            gVar10 = null;
        }
        l(textView23, textView24, gVar10.f40475c.g().f5669e, c4027a3.f40435g);
        TextView textView25 = this.f40460n;
        TextView textView26 = this.f40461o;
        g gVar11 = this.f40458G;
        if (gVar11 == null) {
            AbstractC3159y.y("viewModel");
            gVar11 = null;
        }
        l(textView25, textView26, gVar11.f40475c.g().f5670f, c4027a3.f40436h);
        g gVar12 = this.f40458G;
        if (gVar12 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            gVar2 = gVar12;
        }
        m(gVar2.f40475c.g().f5671g, c4027a3.f40437i);
    }

    public final void r() {
        TextView textView;
        TextView textView2 = this.f40455D;
        if (textView2 != null) {
            C4027a c4027a = this.f40457F;
            if (c4027a == null) {
                AbstractC3159y.y("args");
                c4027a = null;
            }
            textView2.setText(c4027a.f40444p);
        }
        Context context = getContext();
        if (context != null && (textView = this.f40455D) != null) {
            textView.setTextColor(ContextCompat.getColor(context, I1.a.f3737c));
        }
    }
}
