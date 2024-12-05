package C5;

import E6.i;
import K7.m;
import P5.AbstractC1378t;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import z5.C4231a;

/* loaded from: classes5.dex */
public final class f extends T7.a {

    /* renamed from: H, reason: collision with root package name */
    public static final a f1568H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final String f1569I;

    /* renamed from: A, reason: collision with root package name */
    public TextView f1570A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f1571B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f1572C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f1573D;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f1574E;

    /* renamed from: F, reason: collision with root package name */
    public C5.a f1575F;

    /* renamed from: G, reason: collision with root package name */
    public g f1576G;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1577m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1578n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1579o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1580p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1581q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1582r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1583s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1584t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1585u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1586v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f1587w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f1588x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f1589y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f1590z;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3255y.h(simpleName, "PartnersDetailFragment::class.java.simpleName");
        f1569I = simpleName;
    }

    public static final void k(f this$0, M7.d cookieDisclosure) {
        g gVar;
        Iterator it;
        Map map;
        i iVar;
        AbstractC3255y.i(this$0, "this$0");
        g gVar2 = this$0.f1576G;
        if (gVar2 == null) {
            AbstractC3255y.y("viewModel");
            gVar2 = null;
        }
        AbstractC3255y.h(cookieDisclosure, "it");
        gVar2.getClass();
        AbstractC3255y.i(cookieDisclosure, "cookieDisclosure");
        gVar2.f1594d.clear();
        Iterator it2 = cookieDisclosure.f7265a.iterator();
        while (it2.hasNext()) {
            M7.f fVar = (M7.f) it2.next();
            List list = gVar2.f1594d;
            String str = fVar.f7316a;
            String str2 = fVar.f7317b;
            String valueOf = String.valueOf(fVar.f7318c);
            String str3 = fVar.f7319d;
            List list2 = fVar.f7320e;
            String str4 = "";
            int i8 = 0;
            for (Object obj : list2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1378t.w();
                }
                int intValue = ((Number) obj).intValue();
                E6.e eVar = gVar2.f1591a.f976a;
                if (eVar == null || (map = eVar.f2633d) == null || (iVar = (i) map.get(String.valueOf(intValue))) == null) {
                    it = it2;
                } else {
                    Y y8 = Y.f34167a;
                    it = it2;
                    String format = String.format("• %s.", Arrays.copyOf(new Object[]{iVar.f2643b}, 1));
                    AbstractC3255y.h(format, "format(format, *args)");
                    str4 = AbstractC3255y.q(str4, format);
                    if (i8 != list2.size() - 1) {
                        str4 = AbstractC3255y.q(str4, "\n");
                    }
                }
                it2 = it;
                i8 = i9;
            }
            list.add(new T7.e(str, str2, valueOf, str3, str4));
        }
        g gVar3 = this$0.f1576G;
        if (gVar3 == null) {
            AbstractC3255y.y("viewModel");
            gVar3 = null;
        }
        if (!gVar3.f1594d.isEmpty()) {
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                String str5 = z5.e.f41179p;
                if (supportFragmentManager.findFragmentByTag(str5) == null) {
                    FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                    g gVar4 = this$0.f1576G;
                    if (gVar4 == null) {
                        AbstractC3255y.y("viewModel");
                        gVar = null;
                    } else {
                        gVar = gVar4;
                    }
                    C4231a args = new C4231a(gVar.f1594d);
                    AbstractC3255y.i(args, "args");
                    z5.e eVar2 = new z5.e();
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

    public static final void l(f this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        m mVar = m.f5260a;
        StringBuilder sb = new StringBuilder();
        g gVar = this$0.f1576G;
        C5.a aVar = null;
        if (gVar == null) {
            AbstractC3255y.y("viewModel");
            gVar = null;
        }
        C5.a aVar2 = this$0.f1575F;
        if (aVar2 == null) {
            AbstractC3255y.y("args");
            aVar2 = null;
        }
        sb.append(K7.b.a(gVar.a(aVar2.f1560n)));
        sb.append("-id:");
        C5.a aVar3 = this$0.f1575F;
        if (aVar3 == null) {
            AbstractC3255y.y("args");
        } else {
            aVar = aVar3;
        }
        sb.append(aVar.f1559m);
        mVar.f("collapseElement", sb.toString());
        this$0.dismiss();
    }

    public static final void m(f this$0, String link, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(link, "$link");
        Context context = this$0.getContext();
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(link));
            context.startActivity(intent);
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C5.a aVar = this$0.f1575F;
        C5.a aVar2 = null;
        if (aVar == null) {
            AbstractC3255y.y("args");
            aVar = null;
        }
        if (aVar.f1561o.length() > 0) {
            g gVar = this$0.f1576G;
            if (gVar == null) {
                AbstractC3255y.y("viewModel");
                gVar = null;
            }
            C5.a aVar3 = this$0.f1575F;
            if (aVar3 == null) {
                AbstractC3255y.y("args");
            } else {
                aVar2 = aVar3;
            }
            String url = aVar2.f1561o;
            gVar.getClass();
            AbstractC3255y.i(url, "url");
            gVar.f1592b.a(url).observe(this$0, new Observer() { // from class: C5.e
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    f.k(f.this, (M7.d) obj);
                }
            });
            return;
        }
        this$0.r();
    }

    public final void n(View view) {
        this.f1574E = (ImageView) view.findViewById(L1.b.f5822l0);
        this.f1573D = (TextView) view.findViewById(L1.b.f5753I0);
        this.f1572C = (TextView) view.findViewById(L1.b.f5853x0);
        this.f1571B = (TextView) view.findViewById(L1.b.f5793b1);
        this.f1570A = (TextView) view.findViewById(L1.b.f5765O0);
        this.f1590z = (TextView) view.findViewById(L1.b.f5814i1);
        this.f1589y = (TextView) view.findViewById(L1.b.f5755J0);
        this.f1588x = (TextView) view.findViewById(L1.b.f5808g1);
        this.f1587w = (TextView) view.findViewById(L1.b.f5796c1);
        this.f1586v = (TextView) view.findViewById(L1.b.f5767P0);
        this.f1585u = (TextView) view.findViewById(L1.b.f5820k1);
        this.f1584t = (TextView) view.findViewById(L1.b.f5757K0);
        this.f1583s = (TextView) view.findViewById(L1.b.f5811h1);
        this.f1582r = (TextView) view.findViewById(L1.b.f5843s0);
        this.f1580p = (TextView) view.findViewById(L1.b.f5841r1);
        this.f1581q = (TextView) view.findViewById(L1.b.f5849v0);
        this.f1579o = (TextView) view.findViewById(L1.b.f5845t0);
        this.f1578n = (TextView) view.findViewById(L1.b.f5847u0);
        this.f1577m = (TextView) view.findViewById(L1.b.f5787Z0);
        ImageView imageView = this.f1574E;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: C5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.l(f.this, view2);
                }
            });
            g gVar = this.f1576G;
            if (gVar == null) {
                AbstractC3255y.y("viewModel");
                gVar = null;
            }
            imageView.setContentDescription(gVar.f1593c.g().f7385o);
        }
        TextView textView = this.f1573D;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: C5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.q(f.this, view2);
                }
            });
        }
        M7.c cVar = this.f10179j;
        if (cVar != null) {
            Integer num = cVar.f7255g;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            Integer num2 = cVar.f7257i;
            if (num2 != null) {
                int intValue = num2.intValue();
                TextView textView2 = this.f1572C;
                if (textView2 != null) {
                    textView2.setTextColor(intValue);
                }
                TextView textView3 = this.f1571B;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f1570A;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f1590z;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f1589y;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
                TextView textView7 = this.f1588x;
                if (textView7 != null) {
                    textView7.setTextColor(intValue);
                }
                TextView textView8 = this.f1587w;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
                TextView textView9 = this.f1586v;
                if (textView9 != null) {
                    textView9.setTextColor(intValue);
                }
                TextView textView10 = this.f1585u;
                if (textView10 != null) {
                    textView10.setTextColor(intValue);
                }
                TextView textView11 = this.f1584t;
                if (textView11 != null) {
                    textView11.setTextColor(intValue);
                }
                TextView textView12 = this.f1583s;
                if (textView12 != null) {
                    textView12.setTextColor(intValue);
                }
                TextView textView13 = this.f1582r;
                if (textView13 != null) {
                    textView13.setTextColor(intValue);
                }
                TextView textView14 = this.f1580p;
                if (textView14 != null) {
                    textView14.setTextColor(intValue);
                }
                TextView textView15 = this.f1581q;
                if (textView15 != null) {
                    textView15.setTextColor(intValue);
                }
                TextView textView16 = this.f1579o;
                if (textView16 != null) {
                    textView16.setTextColor(intValue);
                }
                TextView textView17 = this.f1578n;
                if (textView17 != null) {
                    textView17.setTextColor(intValue);
                }
            }
            Integer num3 = cVar.f7260l;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                TextView textView18 = this.f1573D;
                if (textView18 != null) {
                    textView18.setTextColor(intValue2);
                }
                TextView textView19 = this.f1577m;
                if (textView19 != null) {
                    textView19.setTextColor(intValue2);
                }
            }
        }
        Typeface typeface = this.f10180k;
        if (typeface != null) {
            TextView textView20 = this.f1587w;
            if (textView20 != null) {
                textView20.setTypeface(typeface);
            }
            TextView textView21 = this.f1586v;
            if (textView21 != null) {
                textView21.setTypeface(typeface);
            }
            TextView textView22 = this.f1585u;
            if (textView22 != null) {
                textView22.setTypeface(typeface);
            }
            TextView textView23 = this.f1584t;
            if (textView23 != null) {
                textView23.setTypeface(typeface);
            }
            TextView textView24 = this.f1583s;
            if (textView24 != null) {
                textView24.setTypeface(typeface);
            }
            TextView textView25 = this.f1578n;
            if (textView25 != null) {
                textView25.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f10181l;
        if (typeface2 != null) {
            TextView textView26 = this.f1572C;
            if (textView26 != null) {
                textView26.setTypeface(typeface2);
            }
            TextView textView27 = this.f1571B;
            if (textView27 != null) {
                textView27.setTypeface(typeface2);
            }
            TextView textView28 = this.f1570A;
            if (textView28 != null) {
                textView28.setTypeface(typeface2);
            }
            TextView textView29 = this.f1590z;
            if (textView29 != null) {
                textView29.setTypeface(typeface2);
            }
            TextView textView30 = this.f1589y;
            if (textView30 != null) {
                textView30.setTypeface(typeface2);
            }
            TextView textView31 = this.f1588x;
            if (textView31 != null) {
                textView31.setTypeface(typeface2);
            }
            TextView textView32 = this.f1573D;
            if (textView32 != null) {
                textView32.setTypeface(typeface2);
            }
            TextView textView33 = this.f1577m;
            if (textView33 != null) {
                textView33.setTypeface(typeface2);
            }
            TextView textView34 = this.f1582r;
            if (textView34 != null) {
                textView34.setTypeface(typeface2);
            }
            TextView textView35 = this.f1580p;
            if (textView35 != null) {
                textView35.setTypeface(typeface2);
            }
            TextView textView36 = this.f1581q;
            if (textView36 != null) {
                textView36.setTypeface(typeface2);
            }
            TextView textView37 = this.f1579o;
            if (textView37 != null) {
                textView37.setTypeface(typeface2);
            }
        }
    }

    public final void o(TextView textView, TextView textView2, String str, String str2) {
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

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C5.a aVar;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            aVar = null;
        } else {
            aVar = (C5.a) arguments.getParcelable("partner_detail_args");
        }
        if (aVar == null) {
            aVar = new C5.a(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 65535);
        }
        this.f1575F = aVar;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f1576G = (g) new ViewModelProvider(viewModelStore, new h()).get(g.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5866i, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…detail, container, false)");
        return inflate;
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i8 = 0;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = m.f5260a;
        StringBuilder sb = new StringBuilder();
        g gVar = this.f1576G;
        g gVar2 = null;
        if (gVar == null) {
            AbstractC3255y.y("viewModel");
            gVar = null;
        }
        C5.a aVar = this.f1575F;
        if (aVar == null) {
            AbstractC3255y.y("args");
            aVar = null;
        }
        sb.append(K7.b.a(gVar.a(aVar.f1560n)));
        sb.append("-id:");
        C5.a aVar2 = this.f1575F;
        if (aVar2 == null) {
            AbstractC3255y.y("args");
            aVar2 = null;
        }
        sb.append(aVar2.f1559m);
        mVar.f("expandElement", sb.toString());
        n(view);
        C5.a aVar3 = this.f1575F;
        if (aVar3 == null) {
            AbstractC3255y.y("args");
            aVar3 = null;
        }
        TextView textView = this.f10171b;
        if (textView != null) {
            textView.setText(aVar3.f1547a);
        }
        String str = aVar3.f1548b;
        if (str != null && !AbstractC3255y.d(str, "null")) {
            TextView textView2 = this.f1572C;
            if (textView2 != null) {
                textView2.setText(str);
            }
            TextView textView3 = this.f1572C;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        if (aVar3.f1556j.length() == 0) {
            TextView textView4 = this.f1582r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f1582r;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f1582r;
            if (textView6 != null) {
                Context context = getContext();
                if (context == null) {
                    string = null;
                } else {
                    int i9 = L1.e.f5898o;
                    g gVar3 = this.f1576G;
                    if (gVar3 == null) {
                        AbstractC3255y.y("viewModel");
                        gVar3 = null;
                    }
                    string = context.getString(i9, gVar3.f1593c.g().f7378h, aVar3.f1556j);
                }
                textView6.setText(string);
            }
        }
        if (aVar3.f1557k.length() == 0) {
            TextView textView7 = this.f1580p;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        } else {
            TextView textView8 = this.f1580p;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = this.f1580p;
            if (textView9 != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    string2 = null;
                } else {
                    int i10 = L1.e.f5898o;
                    g gVar4 = this.f1576G;
                    if (gVar4 == null) {
                        AbstractC3255y.y("viewModel");
                        gVar4 = null;
                    }
                    string2 = context2.getString(i10, gVar4.f1593c.g().f7382l, aVar3.f1557k);
                }
                textView9.setText(string2);
            }
        }
        if (aVar3.f1558l.length() == 0) {
            TextView textView10 = this.f1581q;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
        } else {
            TextView textView11 = this.f1581q;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textView12 = this.f1581q;
            if (textView12 != null) {
                Context context3 = getContext();
                if (context3 == null) {
                    string3 = null;
                } else {
                    string3 = context3.getString(L1.e.f5887d, aVar3.f1558l);
                }
                textView12.setText(string3);
            }
        }
        TextView textView13 = this.f1573D;
        if (textView13 != null) {
            g gVar5 = this.f1576G;
            if (gVar5 == null) {
                AbstractC3255y.y("viewModel");
                gVar5 = null;
            }
            textView13.setText(gVar5.f1593c.g().f7381k);
        }
        TextView textView14 = this.f1573D;
        if (textView14 != null) {
            if (aVar3.f1561o.length() <= 0) {
                i8 = 8;
            }
            textView14.setVisibility(i8);
        }
        TextView textView15 = this.f1587w;
        TextView textView16 = this.f1571B;
        g gVar6 = this.f1576G;
        if (gVar6 == null) {
            AbstractC3255y.y("viewModel");
            gVar6 = null;
        }
        o(textView15, textView16, gVar6.f1593c.g().f7371a, aVar3.f1549c);
        TextView textView17 = this.f1586v;
        TextView textView18 = this.f1570A;
        g gVar7 = this.f1576G;
        if (gVar7 == null) {
            AbstractC3255y.y("viewModel");
            gVar7 = null;
        }
        o(textView17, textView18, gVar7.f1593c.g().f7372b, aVar3.f1550d);
        TextView textView19 = this.f1585u;
        TextView textView20 = this.f1590z;
        g gVar8 = this.f1576G;
        if (gVar8 == null) {
            AbstractC3255y.y("viewModel");
            gVar8 = null;
        }
        o(textView19, textView20, gVar8.f1593c.g().f7373c, aVar3.f1551e);
        TextView textView21 = this.f1584t;
        TextView textView22 = this.f1589y;
        g gVar9 = this.f1576G;
        if (gVar9 == null) {
            AbstractC3255y.y("viewModel");
            gVar9 = null;
        }
        o(textView21, textView22, gVar9.f1593c.g().f7374d, aVar3.f1552f);
        TextView textView23 = this.f1583s;
        TextView textView24 = this.f1588x;
        g gVar10 = this.f1576G;
        if (gVar10 == null) {
            AbstractC3255y.y("viewModel");
            gVar10 = null;
        }
        o(textView23, textView24, gVar10.f1593c.g().f7375e, aVar3.f1553g);
        TextView textView25 = this.f1578n;
        TextView textView26 = this.f1579o;
        g gVar11 = this.f1576G;
        if (gVar11 == null) {
            AbstractC3255y.y("viewModel");
            gVar11 = null;
        }
        o(textView25, textView26, gVar11.f1593c.g().f7376f, aVar3.f1554h);
        g gVar12 = this.f1576G;
        if (gVar12 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            gVar2 = gVar12;
        }
        p(gVar2.f1593c.g().f7377g, aVar3.f1555i);
    }

    public final void p(String str, final String str2) {
        TextView textView;
        if (str.length() > 0 && (textView = this.f1577m) != null) {
            textView.setText(str);
        }
        if (URLUtil.isValidUrl(str2)) {
            TextView textView2 = this.f1577m;
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: C5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        f.m(f.this, str2, view);
                    }
                });
                return;
            }
            return;
        }
        TextView textView3 = this.f1577m;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void r() {
        TextView textView;
        TextView textView2 = this.f1573D;
        if (textView2 != null) {
            C5.a aVar = this.f1575F;
            if (aVar == null) {
                AbstractC3255y.y("args");
                aVar = null;
            }
            textView2.setText(aVar.f1562p);
        }
        Context context = getContext();
        if (context != null && (textView = this.f1573D) != null) {
            textView.setTextColor(ContextCompat.getColor(context, L1.a.f5732c));
        }
    }
}
