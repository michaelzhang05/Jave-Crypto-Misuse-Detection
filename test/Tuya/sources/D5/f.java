package D5;

import H7.n;
import M5.AbstractC1246t;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b.AbstractC1832c;
import c.C1895i;
import com.inmobi.cmp.core.model.Vector;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import n.AbstractC3448a;
import y5.p;
import y5.q;
import y5.r;
import y5.s;

/* loaded from: classes5.dex */
public final class f extends AbstractC3448a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f1841l = new a();

    /* renamed from: m, reason: collision with root package name */
    public static String f1842m;

    /* renamed from: a, reason: collision with root package name */
    public ConstraintLayout f1843a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1844b;

    /* renamed from: c, reason: collision with root package name */
    public Button f1845c;

    /* renamed from: d, reason: collision with root package name */
    public Button f1846d;

    /* renamed from: e, reason: collision with root package name */
    public Button f1847e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1848f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f1849g;

    /* renamed from: h, reason: collision with root package name */
    public l f1850h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f1851i;

    /* renamed from: j, reason: collision with root package name */
    public Typeface f1852j;

    /* renamed from: k, reason: collision with root package name */
    public J7.c f1853k;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    static {
        String simpleName = f.class.getSimpleName();
        AbstractC3159y.h(simpleName, "PrivacyBottomSheet::class.java.simpleName");
        f1842m = simpleName;
    }

    public static final void l(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        l lVar = this$0.f1850h;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        s sVar = lVar.f1866a;
        sVar.f39957z.forEach(new r(sVar));
        sVar.f39927C.forEach(new p(sVar));
        Vector vector = sVar.f39926B;
        vector.unset(vector.getKeys());
        sVar.f39925A.unsetAllOwnedItems();
        sVar.f39948q.unsetAllOwnedItems();
        sVar.f39949r.unsetAllOwnedItems();
        sVar.f39950s.setAllOwnedItems();
        sVar.f39927C.forEach(new q(sVar));
        lVar.a();
        lVar.f1875j.b();
        H7.m.f3657a.b(n.REJECT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: D5.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.m(f.this, (String) obj);
            }
        });
    }

    public static final void m(f this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void o(f this$0, View view) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction add;
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (add = beginTransaction.add(new s5.i(), s5.i.f37996F)) != null) {
            add.commit();
        }
    }

    public static final void p(f this$0, String str) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void q(final f this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        l lVar = this$0.f1850h;
        if (lVar == null) {
            AbstractC3159y.y("viewModel");
            lVar = null;
        }
        lVar.f1866a.x();
        lVar.a();
        lVar.f1875j.a();
        H7.m.f3657a.b(n.ACCEPT_ALL, H7.f.GDPR).observe(this$0, new Observer() { // from class: D5.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                f.p(f.this, (String) obj);
            }
        });
    }

    @Override // n.AbstractC3448a
    public void i(ViewStub viewStub) {
        AbstractC3159y.i(viewStub, "viewStub");
        viewStub.setLayoutResource(I1.c.f3876n);
        View inflatedView = viewStub.inflate();
        AbstractC3159y.h(inflatedView, "inflatedView");
        this.f1843a = (ConstraintLayout) inflatedView.findViewById(I1.b.f3767N);
        this.f1844b = (ImageView) inflatedView.findViewById(I1.b.f3747D);
        this.f1845c = (Button) inflatedView.findViewById(I1.b.f3814h);
        this.f1846d = (Button) inflatedView.findViewById(I1.b.f3808f);
        this.f1847e = (Button) inflatedView.findViewById(I1.b.f3796b);
        this.f1848f = (TextView) inflatedView.findViewById(I1.b.f3782U0);
        this.f1849g = (TextView) inflatedView.findViewById(I1.b.f3843q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableString k(java.lang.String r7, android.text.SpannableString r8, java.lang.String r9, android.text.style.ClickableSpan r10, boolean r11) {
        /*
            r6 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "subString"
            kotlin.jvm.internal.AbstractC3159y.i(r9, r3)
            r3 = 0
            if (r7 != 0) goto Lc
            goto L25
        Lc:
            g6.j r4 = new g6.j
            g6.l r5 = g6.l.f31324c
            r4.<init>(r9, r5)
            f6.g r7 = g6.j.d(r4, r7, r2, r1, r3)
            java.util.Iterator r4 = r7.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L22
            goto L23
        L22:
            r7 = r3
        L23:
            if (r7 != 0) goto L27
        L25:
            r7 = r3
            goto L58
        L27:
            if (r11 == 0) goto L30
            java.lang.Object r7 = f6.AbstractC2683j.x(r7)
        L2d:
            g6.h r7 = (g6.h) r7
            goto L35
        L30:
            java.lang.Object r7 = f6.AbstractC2683j.r(r7)
            goto L2d
        L35:
            d6.i r7 = r7.b()
            int r11 = r7.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r7 = r7.g()
            int r9 = r9.length()
            int r9 = r9 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer[] r9 = new java.lang.Integer[r1]
            r9[r2] = r11
            r9[r0] = r7
            java.util.List r7 = M5.AbstractC1246t.p(r9)
        L58:
            if (r7 != 0) goto L5e
            java.util.List r7 = M5.AbstractC1246t.m()
        L5e:
            boolean r9 = r7.isEmpty()
            r9 = r9 ^ r0
            if (r9 == 0) goto Lb5
            java.lang.Object r9 = M5.AbstractC1246t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r11 = M5.AbstractC1246t.y0(r7)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = 33
            r8.setSpan(r10, r9, r11, r0)
            android.content.Context r9 = r6.getContext()
            if (r9 != 0) goto L85
            goto Lb5
        L85:
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            J7.c r11 = r6.f1853k
            if (r11 != 0) goto L8c
            goto L8e
        L8c:
            java.lang.Integer r3 = r11.f5554l
        L8e:
            if (r3 != 0) goto L97
            int r11 = I1.a.f3736b
            int r9 = androidx.core.content.ContextCompat.getColor(r9, r11)
            goto L9b
        L97:
            int r9 = r3.intValue()
        L9b:
            r10.<init>(r9)
            java.lang.Object r9 = M5.AbstractC1246t.m0(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = M5.AbstractC1246t.y0(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8.setSpan(r10, r9, r7, r0)
        Lb5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.f.k(java.lang.String, android.text.SpannableString, java.lang.String, android.text.style.ClickableSpan, boolean):android.text.SpannableString");
    }

    public final void n() {
        int i8;
        Button button = this.f1847e;
        l lVar = null;
        if (button != null) {
            l lVar2 = this.f1850h;
            if (lVar2 == null) {
                AbstractC3159y.y("viewModel");
                lVar2 = null;
            }
            button.setText(lVar2.f1873h.f5618d);
            button.setOnClickListener(new View.OnClickListener() { // from class: D5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.q(f.this, view);
                }
            });
        }
        Button button2 = this.f1846d;
        if (button2 != null) {
            l lVar3 = this.f1850h;
            if (lVar3 == null) {
                AbstractC3159y.y("viewModel");
                lVar3 = null;
            }
            button2.setText(lVar3.f1873h.f5619e);
            l lVar4 = this.f1850h;
            if (lVar4 == null) {
                AbstractC3159y.y("viewModel");
                lVar4 = null;
            }
            if (lVar4.f1872g) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            button2.setVisibility(i8);
            button2.setOnClickListener(new View.OnClickListener() { // from class: D5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.l(f.this, view);
                }
            });
        }
        Button button3 = this.f1845c;
        if (button3 != null) {
            l lVar5 = this.f1850h;
            if (lVar5 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                lVar = lVar5;
            }
            button3.setText(I7.b.a(lVar.f1873h.f5617c));
            button3.setOnClickListener(new View.OnClickListener() { // from class: D5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.o(f.this, view);
                }
            });
        }
    }

    @Override // n.AbstractC3448a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "it.viewModelStore");
            this.f1850h = (l) new ViewModelProvider(viewModelStore, new m()).get(l.class);
        }
    }

    @Override // n.AbstractC3448a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        TextView textView;
        Map map;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        int i9 = 0;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        j(false);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        J7.b bVar = O7.d.f7810e;
        if (bVar != null) {
            this.f1851i = bVar.f5541a;
            this.f1852j = bVar.f5542b;
        }
        this.f1853k = O7.d.f7811f;
        TextView textView2 = this.f1849g;
        if (textView2 != null) {
            l lVar = this.f1850h;
            if (lVar == null) {
                AbstractC3159y.y("viewModel");
                lVar = null;
            }
            textView2.setText(lVar.f1873h.f5615a);
        }
        l lVar2 = this.f1850h;
        if (lVar2 == null) {
            AbstractC3159y.y("viewModel");
            lVar2 = null;
        }
        B6.e eVar = lVar2.f1866a.f39932a;
        if (eVar == null || (map = eVar.f1043i) == null) {
            i8 = 0;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((B6.l) entry.getValue()).f1061k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            i8 = linkedHashMap.size();
        }
        List list = lVar2.f1867b.f2376c.f2371a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set b12 = AbstractC1246t.b1(((E6.d) obj).f2369f);
            List list2 = lVar2.f1867b.f2375b.f2340h;
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator it = b12.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1832c.a((Number) it.next(), list2)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        int size = lVar2.f1868c.f39889a.size() + arrayList.size() + i8;
        if (lVar2.f1869d != null) {
            i9 = 1;
        }
        String valueOf = String.valueOf(size + i9);
        l lVar3 = this.f1850h;
        if (lVar3 == null) {
            AbstractC3159y.y("viewModel");
            lVar3 = null;
        }
        String str = lVar3.f1873h.f5616b;
        if (C1895i.f14840b) {
            str = AbstractC3159y.q(str, lVar3.f1874i.f3216b.f3211c);
        }
        String y8 = g6.n.y(str, "${partners}", valueOf, true);
        SpannableString spannableString = new SpannableString(y8);
        l lVar4 = this.f1850h;
        if (lVar4 == null) {
            AbstractC3159y.y("viewModel");
            lVar4 = null;
        }
        k(y8, spannableString, lVar4.f1873h.f5620f, new i(this), false);
        l lVar5 = this.f1850h;
        if (lVar5 == null) {
            AbstractC3159y.y("viewModel");
            lVar5 = null;
        }
        k(y8, spannableString, lVar5.f1873h.f5622h, new j(this), true);
        TextView textView3 = this.f1848f;
        if (textView3 != null) {
            textView3.setText(spannableString);
        }
        TextView textView4 = this.f1848f;
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        n();
        J7.c cVar = this.f1853k;
        if (cVar != null) {
            Integer num = cVar.f5549g;
            if (num != null) {
                int intValue = num.intValue();
                ConstraintLayout constraintLayout = this.f1843a;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num2 = cVar.f5550h;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView5 = this.f1849g;
                if (textView5 != null) {
                    textView5.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f5551i;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                TextView textView6 = this.f1848f;
                if (textView6 != null) {
                    textView6.setTextColor(intValue3);
                }
            }
            Integer num4 = cVar.f5555m;
            if (num4 != null) {
                int intValue4 = num4.intValue();
                Button button = this.f1847e;
                if (button != null) {
                    button.setTextColor(intValue4);
                }
                Button button2 = this.f1846d;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num5 = cVar.f5557o;
            if (num5 != null) {
                int intValue5 = num5.intValue();
                Button button3 = this.f1847e;
                if (button3 != null) {
                    button3.setBackgroundColor(intValue5);
                }
                Button button4 = this.f1846d;
                if (button4 != null) {
                    button4.setBackgroundColor(intValue5);
                }
            }
            Integer num6 = cVar.f5554l;
            if (num6 != null) {
                int intValue6 = num6.intValue();
                Button button5 = this.f1845c;
                if (button5 != null) {
                    button5.setTextColor(intValue6);
                }
            }
        }
        Typeface typeface = this.f1851i;
        if (typeface != null) {
            TextView textView7 = this.f1849g;
            if (textView7 != null) {
                textView7.setTypeface(typeface);
            }
            Button button6 = this.f1847e;
            if (button6 != null) {
                button6.setTypeface(typeface);
            }
            Button button7 = this.f1846d;
            if (button7 != null) {
                button7.setTypeface(typeface);
            }
            Button button8 = this.f1845c;
            if (button8 != null) {
                button8.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f1852j;
        if (typeface2 != null && (textView = this.f1848f) != null) {
            textView.setTypeface(typeface2);
        }
        l lVar6 = this.f1850h;
        if (lVar6 == null) {
            AbstractC3159y.y("viewModel");
            lVar6 = null;
        }
        h result = new h(this);
        lVar6.getClass();
        AbstractC3159y.i(result, "result");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(lVar6), C2812b0.b(), null, new k(result, lVar6, null), 2, null);
    }
}
