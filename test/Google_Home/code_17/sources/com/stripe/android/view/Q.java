package com.stripe.android.view;

import P5.AbstractC1378t;
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
import kotlin.jvm.internal.AbstractC3255y;
import y2.C4202a;
import y2.C4203b;

/* loaded from: classes4.dex */
public final class Q extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List f28623a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f28624b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28625c;

    /* renamed from: d, reason: collision with root package name */
    private List f28626d;

    /* loaded from: classes4.dex */
    private static final class a extends Filter {

        /* renamed from: a, reason: collision with root package name */
        private List f28627a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f28628b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference f28629c;

        public a(List unfilteredCountries, Q adapter, Activity activity) {
            AbstractC3255y.i(unfilteredCountries, "unfilteredCountries");
            AbstractC3255y.i(adapter, "adapter");
            this.f28627a = unfilteredCountries;
            this.f28628b = adapter;
            this.f28629c = new WeakReference(activity);
        }

        private final List a(CharSequence charSequence) {
            List b8 = b(charSequence);
            if (b8.isEmpty() || d(b8, charSequence)) {
                return this.f28627a;
            }
            return b8;
        }

        private final List b(CharSequence charSequence) {
            List list = this.f28627a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String g8 = ((C4202a) obj).g();
                Locale locale = Locale.ROOT;
                String lowerCase = g8.toLowerCase(locale);
                AbstractC3255y.h(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                AbstractC3255y.h(lowerCase2, "toLowerCase(...)");
                if (j6.n.C(lowerCase, lowerCase2, false, 2, null)) {
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
            if (list.size() != 1 || !AbstractC3255y.d(((C4202a) list.get(0)).g(), String.valueOf(charSequence))) {
                return false;
            }
            return true;
        }

        public final void e(List list) {
            AbstractC3255y.i(list, "<set-?>");
            this.f28627a = list;
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            List list;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || (list = a(charSequence)) == null) {
                list = this.f28627a;
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
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = (Activity) this.f28629c.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (AbstractC3255y.d(((C4202a) it.next()).g(), charSequence)) {
                            c(activity);
                            break;
                        }
                    }
                }
            }
            this.f28628b.f28626d = list;
            this.f28628b.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Context context, List unfilteredCountries, int i8, Function1 textViewFactory) {
        super(context, i8);
        Activity activity;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(unfilteredCountries, "unfilteredCountries");
        AbstractC3255y.i(textViewFactory, "textViewFactory");
        this.f28623a = unfilteredCountries;
        this.f28624b = textViewFactory;
        List list = this.f28623a;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f28625c = new a(list, this, activity);
        this.f28626d = this.f28623a;
    }

    public final /* synthetic */ C4202a b() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4202a getItem(int i8) {
        return (C4202a) this.f28626d.get(i8);
    }

    @Override // android.widget.ArrayAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int getPosition(C4202a c4202a) {
        return AbstractC1378t.r0(this.f28626d, c4202a);
    }

    public final List e() {
        return this.f28623a;
    }

    public final boolean f(Set allowedCountryCodes) {
        AbstractC3255y.i(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List list = this.f28623a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4203b a8 = ((C4202a) obj).a();
            Set set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (j6.n.s((String) it.next(), a8.b(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        this.f28623a = arrayList;
        this.f28625c.e(arrayList);
        this.f28626d = this.f28623a;
        notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f28626d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.f28625c;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i8) {
        return getItem(i8).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        TextView textView;
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) this.f28624b.invoke(viewGroup);
        }
        textView.setText(getItem(i8).g());
        return textView;
    }
}
