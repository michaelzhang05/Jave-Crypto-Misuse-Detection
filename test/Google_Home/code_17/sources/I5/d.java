package I5;

import E6.g;
import E6.j;
import T7.i;
import U7.a;
import android.R;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import v5.k;
import v5.l;

/* loaded from: classes5.dex */
public final class d extends T7.a implements a.b {

    /* renamed from: v, reason: collision with root package name */
    public static final a f4211v = new a();

    /* renamed from: w, reason: collision with root package name */
    public static final String f4212w = d.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public Button f4213m;

    /* renamed from: n, reason: collision with root package name */
    public Button f4214n;

    /* renamed from: o, reason: collision with root package name */
    public RecyclerView f4215o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f4216p;

    /* renamed from: q, reason: collision with root package name */
    public ConstraintLayout f4217q;

    /* renamed from: r, reason: collision with root package name */
    public int f4218r;

    /* renamed from: s, reason: collision with root package name */
    public U7.a f4219s;

    /* renamed from: t, reason: collision with root package name */
    public e f4220t;

    /* renamed from: u, reason: collision with root package name */
    public k f4221u;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(d this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(d this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        e eVar = this$0.f4220t;
        if (eVar == null) {
            AbstractC3255y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f4218r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f4222a.f993r.unset(((U7.d) it.next()).f10538a.f2642a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f4222a.f992q.unset(((U7.d) it2.next()).f10538a.f2642a);
        }
        this$0.q();
    }

    public static final void n(d this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        e eVar = this$0.f4220t;
        if (eVar == null) {
            AbstractC3255y.y("viewModel");
            eVar = null;
        }
        int i8 = this$0.f4218r;
        Iterator it = ((ArrayList) eVar.c(i8)).iterator();
        while (it.hasNext()) {
            eVar.f4222a.f993r.set(((U7.d) it.next()).f10538a.f2642a);
        }
        Iterator it2 = ((ArrayList) eVar.d(i8)).iterator();
        while (it2.hasNext()) {
            eVar.f4222a.f992q.set(((U7.d) it2.next()).f10538a.f2642a);
        }
        this$0.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U7.a.b
    public void c(U7.d item) {
        AbstractC3255y.i(item, "item");
        FragmentActivity activity = getActivity();
        if (activity != null && (item.f10538a instanceof g)) {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            i.a aVar = i.f10207y;
            String str = i.f10208z;
            if (supportFragmentManager.findFragmentByTag(str) == null) {
                FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
                E6.f fVar = item.f10538a;
                String str2 = fVar.f2643b;
                String a8 = ((g) fVar).a();
                String b8 = ((g) item.f10538a).b();
                e eVar = this.f4220t;
                e eVar2 = null;
                if (eVar == null) {
                    AbstractC3255y.y("viewModel");
                    eVar = null;
                }
                String str3 = eVar.f4224c.h().f7411b;
                e eVar3 = this.f4220t;
                if (eVar3 == null) {
                    AbstractC3255y.y("viewModel");
                } else {
                    eVar2 = eVar3;
                }
                beginTransaction.add(i.a.a(aVar, str2, a8, b8, str3, eVar2.f4224c.h().f7414e, item.f10538a.f2642a, item.f10541d, false, null, 384), str).commit();
            }
        }
    }

    @Override // U7.a.b
    public void d(U7.d switchItem) {
        AbstractC3255y.i(switchItem, "item");
        e eVar = this.f4220t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3255y.y("viewModel");
            eVar = null;
        }
        eVar.getClass();
        AbstractC3255y.i(switchItem, "switchItem");
        int ordinal = switchItem.f10541d.ordinal();
        if (ordinal != 4) {
            if (ordinal == 7) {
                if (AbstractC3255y.d(switchItem.f10539b, Boolean.TRUE)) {
                    eVar.f4222a.f992q.set(switchItem.f10538a.f2642a);
                } else {
                    eVar.f4222a.f992q.unset(switchItem.f10538a.f2642a);
                }
            }
        } else if (AbstractC3255y.d(switchItem.f10539b, Boolean.TRUE)) {
            eVar.f4222a.f993r.set(switchItem.f10538a.f2642a);
        } else {
            eVar.f4222a.f993r.unset(switchItem.f10538a.f2642a);
        }
        e eVar3 = this.f4220t;
        if (eVar3 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            eVar2 = eVar3;
        }
        l(eVar2.b(this.f4218r));
    }

    public final void l(Set set) {
        boolean z8;
        Button button = this.f4214n;
        boolean z9 = false;
        if (button != null) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z8 = true;
                        break;
                    }
                }
            }
            z8 = false;
            button.setEnabled(z8);
        }
        Button button2 = this.f4213m;
        if (button2 != null) {
            if (!set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
            }
            button2.setEnabled(z9);
        }
    }

    public final ColorStateList o() {
        Integer num;
        M7.c cVar = this.f10179j;
        if (cVar == null || (num = cVar.f7263o) == null || cVar.f7264p == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f7264p.intValue()});
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f4220t = (e) new ViewModelProvider(viewModelStore, new f()).get(e.class);
            ViewModelStore viewModelStore2 = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore2, "it.viewModelStore");
            this.f4221u = (k) new ViewModelProvider(viewModelStore2, new l()).get(k.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5868k, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…stacks, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC3255y.i(dialog, "dialog");
        super.onDismiss(dialog);
        k kVar = this.f4221u;
        if (kVar == null) {
            AbstractC3255y.y("optionsViewModel");
            kVar = null;
        }
        kVar.f40304o.postValue(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentActivity activity;
        AbstractC3255y.i(item, "item");
        if (item.getItemId() == 16908332 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i8;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        Map map;
        j jVar;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f4213m = (Button) view.findViewById(L1.b.f5794c);
        this.f4214n = (Button) view.findViewById(L1.b.f5806g);
        this.f4215o = (RecyclerView) view.findViewById(L1.b.f5786Z);
        this.f4216p = (TextView) view.findViewById(L1.b.f5823l1);
        this.f4217q = (ConstraintLayout) view.findViewById(L1.b.f5807g0);
        Bundle arguments = getArguments();
        if (arguments == null) {
            i8 = 0;
        } else {
            i8 = arguments.getInt("stack_id");
        }
        this.f4218r = i8;
        TextView textView = this.f4216p;
        U7.a aVar = null;
        if (textView != null) {
            e eVar = this.f4220t;
            if (eVar == null) {
                AbstractC3255y.y("viewModel");
                eVar = null;
            }
            int i9 = this.f4218r;
            E6.e eVar2 = eVar.f4222a.f976a;
            if (eVar2 == null || (map = eVar2.f2639j) == null || (jVar = (j) map.get(String.valueOf(i9))) == null) {
                str = null;
            } else {
                str = jVar.f2643b;
            }
            textView.setText(str);
        }
        TextView textView2 = this.f10171b;
        if (textView2 != null) {
            e eVar3 = this.f4220t;
            if (eVar3 == null) {
                AbstractC3255y.y("viewModel");
                eVar3 = null;
            }
            textView2.setText(eVar3.f4224c.h().f7410a);
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: I5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.k(d.this, view2);
                }
            });
            e eVar4 = this.f4220t;
            if (eVar4 == null) {
                AbstractC3255y.y("viewModel");
                eVar4 = null;
            }
            imageView.setContentDescription(eVar4.f4224c.h().f7415f);
        }
        M7.c cVar = this.f10179j;
        if (cVar != null) {
            Integer num5 = cVar.f7255g;
            if (num5 != null) {
                int intValue = num5.intValue();
                ConstraintLayout constraintLayout = this.f4217q;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue);
                }
            }
            Integer num6 = cVar.f7257i;
            if (num6 != null) {
                int intValue2 = num6.intValue();
                TextView textView3 = this.f4216p;
                if (textView3 != null) {
                    textView3.setTextColor(intValue2);
                }
            }
            Typeface typeface = this.f10181l;
            if (typeface != null) {
                TextView textView4 = this.f4216p;
                if (textView4 != null) {
                    textView4.setTypeface(typeface);
                }
                Button button = this.f4213m;
                if (button != null) {
                    button.setTypeface(typeface);
                }
                Button button2 = this.f4214n;
                if (button2 != null) {
                    button2.setTypeface(typeface);
                }
            }
            Button button3 = this.f4213m;
            if (button3 != null) {
                ColorStateList p8 = p();
                if (p8 != null) {
                    button3.setTextColor(p8);
                }
                ColorStateList o8 = o();
                if (o8 != null) {
                    button3.setBackgroundTintList(o8);
                }
            }
            Button button4 = this.f4214n;
            if (button4 != null) {
                ColorStateList p9 = p();
                if (p9 != null) {
                    button4.setTextColor(p9);
                }
                ColorStateList o9 = o();
                if (o9 != null) {
                    button4.setBackgroundTintList(o9);
                }
            }
        }
        e eVar5 = this.f4220t;
        if (eVar5 == null) {
            AbstractC3255y.y("viewModel");
            eVar5 = null;
        }
        List a8 = eVar5.a(this.f4218r);
        M7.c cVar2 = this.f10179j;
        if (cVar2 == null) {
            num = null;
        } else {
            num = cVar2.f7257i;
        }
        if (cVar2 == null) {
            num2 = null;
        } else {
            num2 = cVar2.f7253e;
        }
        if (cVar2 == null) {
            num3 = null;
        } else {
            num3 = cVar2.f7254f;
        }
        if (cVar2 == null) {
            num4 = null;
        } else {
            num4 = cVar2.f7249a;
        }
        this.f4219s = new U7.a(a8, this, null, null, num, num2, num3, num4, null, this.f10181l, 268);
        RecyclerView recyclerView = this.f4215o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            U7.a aVar2 = this.f4219s;
            if (aVar2 == null) {
                AbstractC3255y.y("switchAdapter");
            } else {
                aVar = aVar2;
            }
            recyclerView.setAdapter(aVar);
        }
        r();
    }

    public final ColorStateList p() {
        Integer num;
        M7.c cVar = this.f10179j;
        if (cVar == null || (num = cVar.f7261m) == null || cVar.f7262n == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num.intValue(), cVar.f7262n.intValue()});
    }

    public final void q() {
        U7.a aVar = this.f4219s;
        e eVar = null;
        if (aVar == null) {
            AbstractC3255y.y("switchAdapter");
            aVar = null;
        }
        e eVar2 = this.f4220t;
        if (eVar2 == null) {
            AbstractC3255y.y("viewModel");
            eVar2 = null;
        }
        aVar.b(eVar2.a(this.f4218r), true);
        e eVar3 = this.f4220t;
        if (eVar3 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            eVar = eVar3;
        }
        l(eVar.b(this.f4218r));
    }

    public final void r() {
        Button button = this.f4214n;
        if (button != null) {
            button.setText(getString(L1.e.f5888e));
        }
        e eVar = this.f4220t;
        e eVar2 = null;
        if (eVar == null) {
            AbstractC3255y.y("viewModel");
            eVar = null;
        }
        l(eVar.b(this.f4218r));
        Button button2 = this.f4214n;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: I5.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.m(d.this, view);
                }
            });
        }
        Button button3 = this.f4213m;
        if (button3 != null) {
            e eVar3 = this.f4220t;
            if (eVar3 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                eVar2 = eVar3;
            }
            button3.setText(eVar2.f4224c.h().f7412c);
        }
        Button button4 = this.f4213m;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() { // from class: I5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.n(d.this, view);
                }
            });
        }
    }
}
