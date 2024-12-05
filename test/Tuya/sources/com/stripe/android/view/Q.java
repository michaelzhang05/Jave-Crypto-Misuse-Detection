package com.stripe.android.view;

import M5.AbstractC1246t;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3825a;
import v2.C3826b;

/* loaded from: classes4.dex */
public final class Q extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List f27568a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f27569b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27570c;

    /* renamed from: d, reason: collision with root package name */
    private List f27571d;

    /* loaded from: classes4.dex */
    private static final class a extends Filter {

        /* renamed from: a, reason: collision with root package name */
        private List f27572a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f27573b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference f27574c;

        public a(List unfilteredCountries, Q adapter, Activity activity) {
            AbstractC3159y.i(unfilteredCountries, "unfilteredCountries");
            AbstractC3159y.i(adapter, "adapter");
            this.f27572a = unfilteredCountries;
            this.f27573b = adapter;
            this.f27574c = new WeakReference(activity);
        }

        private final List a(CharSequence charSequence) {
            List b8 = b(charSequence);
            if (b8.isEmpty() || d(b8, charSequence)) {
                return this.f27572a;
            }
            return b8;
        }

        private final List b(CharSequence charSequence) {
            List list = this.f27572a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String e8 = ((C3825a) obj).e();
                Locale locale = Locale.ROOT;
                String lowerCase = e8.toLowerCase(locale);
                AbstractC3159y.h(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                AbstractC3159y.h(lowerCase2, "toLowerCase(...)");
                if (g6.n.C(lowerCase, lowerCase2, false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final void c(Activity activity) {
            InputMethodManager inputMethodManager;
            Object systemService = activity.getSystemService("input_method");
            IBinder iBinder = null;
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }

        private final boolean d(List list, CharSequence charSequence) {
            if (list.size() != 1 || !AbstractC3159y.d(((C3825a) list.get(0)).e(), String.valueOf(charSequence))) {
                return false;
            }
            return true;
        }

        public final void e(List list) {
            AbstractC3159y.i(list, "<set-?>");
            this.f27572a = list;
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            List list;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || (list = a(charSequence)) == null) {
                list = this.f27572a;
            }
            filterResults.values = list;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj;
            if (filterResults != null) {
                obj = filterResults.values;
            } else {
                obj = null;
            }
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = (Activity) this.f27574c.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (AbstractC3159y.d(((C3825a) it.next()).e(), charSequence)) {
                            c(activity);
                            break;
                        }
                    }
                }
            }
            this.f27573b.f27571d = list;
            this.f27573b.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Context context, List unfilteredCountries, int i8, Function1 textViewFactory) {
        super(context, i8);
        Activity activity;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(unfilteredCountries, "unfilteredCountries");
        AbstractC3159y.i(textViewFactory, "textViewFactory");
        this.f27568a = unfilteredCountries;
        this.f27569b = textViewFactory;
        List list = this.f27568a;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f27570c = new a(list, this, activity);
        this.f27571d = this.f27568a;
    }

    public final /* synthetic */ C3825a b() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3825a getItem(int i8) {
        return (C3825a) this.f27571d.get(i8);
    }

    @Override // android.widget.ArrayAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int getPosition(C3825a c3825a) {
        return AbstractC1246t.r0(this.f27571d, c3825a);
    }

    public final List e() {
        return this.f27568a;
    }

    public final boolean f(Set allowedCountryCodes) {
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List list = this.f27568a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3826b b8 = ((C3825a) obj).b();
            Set set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (g6.n.s((String) it.next(), b8.c(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        this.f27568a = arrayList;
        this.f27570c.e(arrayList);
        this.f27571d = this.f27568a;
        notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f27571d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f27570c;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i8) {
        return getItem(i8).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        TextView textView;
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) this.f27569b.invoke(viewGroup);
        }
        textView.setText(getItem(i8).e());
        return textView;
    }
}
