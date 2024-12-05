package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends i2 implements androidx.appcompat.view.c {

    /* renamed from: n0, reason: collision with root package name */
    static final o f813n0;
    private Rect A;
    private int[] B;
    private int[] C;
    private final ImageView D;
    private final Drawable E;
    private final int F;
    private final int G;
    private final Intent H;
    private final Intent I;
    private final CharSequence J;
    View.OnFocusChangeListener K;
    private View.OnClickListener L;
    private boolean M;
    private boolean N;
    w.a O;
    private boolean P;
    private CharSequence Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private CharSequence V;
    private CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f814a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f815b0;

    /* renamed from: c0, reason: collision with root package name */
    SearchableInfo f816c0;

    /* renamed from: d0, reason: collision with root package name */
    private Bundle f817d0;

    /* renamed from: e0, reason: collision with root package name */
    private final Runnable f818e0;

    /* renamed from: f0, reason: collision with root package name */
    private Runnable f819f0;

    /* renamed from: g0, reason: collision with root package name */
    private final WeakHashMap f820g0;

    /* renamed from: h0, reason: collision with root package name */
    private final View.OnClickListener f821h0;

    /* renamed from: i0, reason: collision with root package name */
    View.OnKeyListener f822i0;

    /* renamed from: j0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f823j0;

    /* renamed from: k0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f824k0;

    /* renamed from: l0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f825l0;

    /* renamed from: m0, reason: collision with root package name */
    private TextWatcher f826m0;

    /* renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f827p;

    /* renamed from: q, reason: collision with root package name */
    private final View f828q;

    /* renamed from: r, reason: collision with root package name */
    private final View f829r;

    /* renamed from: s, reason: collision with root package name */
    private final View f830s;

    /* renamed from: t, reason: collision with root package name */
    final ImageView f831t;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f832u;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f833v;

    /* renamed from: w, reason: collision with root package name */
    final ImageView f834w;

    /* renamed from: x, reason: collision with root package name */
    private final View f835x;

    /* renamed from: y, reason: collision with root package name */
    private q f836y;

    /* renamed from: z, reason: collision with root package name */
    private Rect f837z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e, reason: collision with root package name */
        private int f838e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f839f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f840g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f841h;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, d.a.f6126m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = configuration.screenHeightDp;
            if (i6 >= 960 && i7 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                return (i6 < 640 || i7 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f813n0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f840g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f840g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f838e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f840g) {
                removeCallbacks(this.f841h);
                post(this.f841h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z5, int i6, Rect rect) {
            super.onFocusChanged(z5, i6, rect);
            this.f839f.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f839f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f839f.hasFocus() && getVisibility() == 0) {
                this.f840g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z5) {
                this.f840g = false;
                removeCallbacks(this.f841h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f840g = true;
                    return;
                }
                this.f840g = false;
                removeCallbacks(this.f841h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f839f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f838e = i6;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6);
            this.f841h = new a();
            this.f838e = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            SearchView.this.Y(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.a aVar = SearchView.this.O;
            if (aVar instanceof x2) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z5);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            SearchView.this.B();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f831t) {
                searchView.V();
                return;
            }
            if (view == searchView.f833v) {
                searchView.R();
                return;
            }
            if (view == searchView.f832u) {
                searchView.W();
            } else if (view == searchView.f834w) {
                searchView.a0();
            } else if (view == searchView.f827p) {
                searchView.H();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i6, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f816c0 == null) {
                return false;
            }
            if (searchView.f827p.isPopupShowing() && SearchView.this.f827p.getListSelection() != -1) {
                return SearchView.this.X(view, i6, keyEvent);
            }
            if (SearchView.this.f827p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i6 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f827p.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
            SearchView.this.S(i6, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i6, long j6) {
            SearchView.this.T(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i6) {
            searchAutoComplete.setInputMethodMode(i6);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f853a;

        /* renamed from: b, reason: collision with root package name */
        private Method f854b;

        /* renamed from: c, reason: collision with root package name */
        private Method f855c;

        o() {
            this.f853a = null;
            this.f854b = null;
            this.f855c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f853a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f854b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f855c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f854b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f853a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f855c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p extends x.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f856c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i6) {
                return new p[i6];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f856c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f856c + "}";
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Boolean.valueOf(this.f856c));
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f857a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f858b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f859c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f860d;

        /* renamed from: e, reason: collision with root package name */
        private final int f861e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f862f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f861e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f858b = new Rect();
            this.f860d = new Rect();
            this.f859c = new Rect();
            a(rect, rect2);
            this.f857a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f858b.set(rect);
            this.f860d.set(rect);
            Rect rect3 = this.f860d;
            int i6 = this.f861e;
            rect3.inset(-i6, -i6);
            this.f859c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z5;
            float f6;
            int i6;
            boolean z6;
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z7 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z6 = this.f862f;
                    if (z6 && !this.f860d.contains(x5, y5)) {
                        z7 = z6;
                        z5 = false;
                    }
                } else {
                    if (action == 3) {
                        z6 = this.f862f;
                        this.f862f = false;
                    }
                    z5 = true;
                    z7 = false;
                }
                z7 = z6;
                z5 = true;
            } else {
                if (this.f858b.contains(x5, y5)) {
                    this.f862f = true;
                    z5 = true;
                }
                z5 = true;
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            if (!z5 || this.f859c.contains(x5, y5)) {
                Rect rect = this.f859c;
                f6 = x5 - rect.left;
                i6 = y5 - rect.top;
            } else {
                f6 = this.f857a.getWidth() / 2;
                i6 = this.f857a.getHeight() / 2;
            }
            motionEvent.setLocation(f6, i6);
            return this.f857a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f813n0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i6, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f817d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i6 != 0) {
            intent.putExtra("action_key", i6);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f816c0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i6, String str) {
        int i7;
        String o6;
        try {
            String o7 = x2.o(cursor, "suggest_intent_action");
            if (o7 == null) {
                o7 = this.f816c0.getSuggestIntentAction();
            }
            if (o7 == null) {
                o7 = "android.intent.action.SEARCH";
            }
            String str2 = o7;
            String o8 = x2.o(cursor, "suggest_intent_data");
            if (o8 == null) {
                o8 = this.f816c0.getSuggestIntentData();
            }
            if (o8 != null && (o6 = x2.o(cursor, "suggest_intent_data_id")) != null) {
                o8 = o8 + "/" + Uri.encode(o6);
            }
            return C(str2, o8 == null ? null : Uri.parse(o8), x2.o(cursor, "suggest_intent_extra_data"), x2.o(cursor, "suggest_intent_query"), i6, str);
        } catch (RuntimeException e6) {
            try {
                i7 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i7 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i7 + " returned exception.", e6);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f817d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f827p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i6 = iArr[1];
        int[] iArr2 = this.C;
        int i7 = i6 - iArr2[1];
        int i8 = iArr[0] - iArr2[0];
        rect.set(i8, i7, view.getWidth() + i8, view.getHeight() + i7);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f827p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f816c0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f816c0.getVoiceSearchLaunchWebSearch() ? this.H : this.f816c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.P || this.U) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e6) {
            Log.e("SearchView", "Failed launch activity: " + intent, e6);
        }
    }

    private boolean Q(int i6, int i7, String str) {
        Cursor c6 = this.O.c();
        if (c6 == null || !c6.moveToPosition(i6)) {
            return false;
        }
        O(D(c6, i7, str));
        return true;
    }

    private void b0() {
        post(this.f818e0);
    }

    private void c0(int i6) {
        CharSequence a6;
        Editable text = this.f827p.getText();
        Cursor c6 = this.O.c();
        if (c6 == null) {
            return;
        }
        if (!c6.moveToPosition(i6) || (a6 = this.O.a(c6)) == null) {
            setQuery(text);
        } else {
            setQuery(a6);
        }
    }

    private void e0() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f827p.getText());
        if (!z6 && (!this.M || this.f814a0)) {
            z5 = false;
        }
        this.f833v.setVisibility(z5 ? 0 : 8);
        Drawable drawable = this.f833v.getDrawable();
        if (drawable != null) {
            drawable.setState(z6 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f827p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(d.d.f6153e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(d.d.f6154f);
    }

    private void h0() {
        this.f827p.setThreshold(this.f816c0.getSuggestThreshold());
        this.f827p.setImeOptions(this.f816c0.getImeOptions());
        int inputType = this.f816c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f816c0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f827p.setInputType(inputType);
        w.a aVar = this.O;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f816c0.getSuggestAuthority() != null) {
            x2 x2Var = new x2(getContext(), this, this.f816c0, this.f820g0);
            this.O = x2Var;
            this.f827p.setAdapter(x2Var);
            ((x2) this.O).x(this.R ? 2 : 1);
        }
    }

    private void i0() {
        this.f830s.setVisibility((N() && (this.f832u.getVisibility() == 0 || this.f834w.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z5) {
        this.f832u.setVisibility((this.P && N() && hasFocus() && (z5 || !this.U)) ? 0 : 8);
    }

    private void k0(boolean z5) {
        this.N = z5;
        int i6 = z5 ? 0 : 8;
        boolean z6 = !TextUtils.isEmpty(this.f827p.getText());
        this.f831t.setVisibility(i6);
        j0(z6);
        this.f828q.setVisibility(z5 ? 8 : 0);
        this.D.setVisibility((this.D.getDrawable() == null || this.M) ? 8 : 0);
        e0();
        l0(!z6);
        i0();
    }

    private void l0(boolean z5) {
        int i6 = 8;
        if (this.U && !L() && z5) {
            this.f832u.setVisibility(8);
            i6 = 0;
        }
        this.f834w.setVisibility(i6);
    }

    private void setQuery(CharSequence charSequence) {
        this.f827p.setText(charSequence);
        this.f827p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f835x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f829r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b6 = p3.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(d.d.f6151c) + resources.getDimensionPixelSize(d.d.f6152d) : 0;
            this.f827p.getDropDownBackground().getPadding(rect);
            int i6 = rect.left;
            this.f827p.setDropDownHorizontalOffset(b6 ? -i6 : paddingLeft - (i6 + dimensionPixelSize));
            this.f827p.setDropDownWidth((((this.f835x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f827p);
            return;
        }
        o oVar = f813n0;
        oVar.b(this.f827p);
        oVar.a(this.f827p);
    }

    public boolean L() {
        return this.N;
    }

    void P(int i6, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i6, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f827p.getText())) {
            this.f827p.setText("");
            this.f827p.requestFocus();
            this.f827p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i6, int i7, String str) {
        Q(i6, 0, null);
        this.f827p.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i6) {
        c0(i6);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f827p.requestFocus();
        this.f827p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f827p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f816c0 != null) {
            P(0, null, text.toString());
        }
        this.f827p.setImeVisibility(false);
        G();
    }

    boolean X(View view, int i6, KeyEvent keyEvent) {
        if (this.f816c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i6 == 66 || i6 == 84 || i6 == 61) {
                return S(this.f827p.getListSelection(), 0, null);
            }
            if (i6 == 21 || i6 == 22) {
                this.f827p.setSelection(i6 == 21 ? 0 : this.f827p.length());
                this.f827p.setListSelection(0);
                this.f827p.clearListSelection();
                this.f827p.b();
                return true;
            }
            if (i6 == 19) {
                this.f827p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f827p.getText();
        this.W = text;
        boolean z5 = !TextUtils.isEmpty(text);
        j0(z5);
        l0(!z5);
        e0();
        i0();
        this.V = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f827p.hasFocus()) {
            H();
        }
    }

    void a0() {
        Intent E;
        SearchableInfo searchableInfo = this.f816c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                E = F(this.H, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                E = E(this.I, searchableInfo);
            }
            getContext().startActivity(E);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f814a0) {
            return;
        }
        this.f814a0 = true;
        int imeOptions = this.f827p.getImeOptions();
        this.f815b0 = imeOptions;
        this.f827p.setImeOptions(imeOptions | 33554432);
        this.f827p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.f827p.clearFocus();
        this.f827p.setImeVisibility(false);
        this.S = false;
    }

    public void d0(CharSequence charSequence, boolean z5) {
        this.f827p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f827p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z5 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f827p.setImeOptions(this.f815b0);
        this.f814a0 = false;
    }

    void f0() {
        int[] iArr = this.f827p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f829r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f830s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f827p.getImeOptions();
    }

    public int getInputType() {
        return this.f827p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f827p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f816c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f816c0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.F;
    }

    public w.a getSuggestionsAdapter() {
        return this.O;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f818e0);
        post(this.f819f0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (z5) {
            I(this.f827p, this.f837z);
            Rect rect = this.A;
            Rect rect2 = this.f837z;
            rect.set(rect2.left, 0, rect2.right, i9 - i7);
            q qVar = this.f836y;
            if (qVar != null) {
                qVar.a(this.A, this.f837z);
                return;
            }
            q qVar2 = new q(this.A, this.f837z, this.f827p);
            this.f836y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.i2, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.T
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.T
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.T
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f856c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f856c = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i6, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i6, rect);
        }
        boolean requestFocus = this.f827p.requestFocus(i6, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f817d0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.M == z5) {
            return;
        }
        this.M = z5;
        k0(z5);
        g0();
    }

    public void setImeOptions(int i6) {
        this.f827p.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.f827p.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.T = i6;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.R = z5;
        w.a aVar = this.O;
        if (aVar instanceof x2) {
            ((x2) aVar).x(z5 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f816c0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.U = K;
        if (K) {
            this.f827p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.P = z5;
        k0(L());
    }

    public void setSuggestionsAdapter(w.a aVar) {
        this.O = aVar;
        this.f827p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.F);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f837z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f818e0 = new b();
        this.f819f0 = new c();
        this.f820g0 = new WeakHashMap();
        f fVar = new f();
        this.f821h0 = fVar;
        this.f822i0 = new g();
        h hVar = new h();
        this.f823j0 = hVar;
        i iVar = new i();
        this.f824k0 = iVar;
        j jVar = new j();
        this.f825l0 = jVar;
        this.f826m0 = new a();
        c3 v5 = c3.v(context, attributeSet, d.j.f6278f2, i6, 0);
        androidx.core.view.b1.o0(this, context, d.j.f6278f2, attributeSet, v5.r(), i6, 0);
        LayoutInflater.from(context).inflate(v5.n(d.j.f6328p2, d.g.f6231r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(d.f.D);
        this.f827p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f828q = findViewById(d.f.f6213z);
        View findViewById = findViewById(d.f.C);
        this.f829r = findViewById;
        View findViewById2 = findViewById(d.f.J);
        this.f830s = findViewById2;
        ImageView imageView = (ImageView) findViewById(d.f.f6211x);
        this.f831t = imageView;
        ImageView imageView2 = (ImageView) findViewById(d.f.A);
        this.f832u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(d.f.f6212y);
        this.f833v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(d.f.E);
        this.f834w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(d.f.B);
        this.D = imageView5;
        androidx.core.view.b1.u0(findViewById, v5.g(d.j.f6333q2));
        androidx.core.view.b1.u0(findViewById2, v5.g(d.j.f6353u2));
        imageView.setImageDrawable(v5.g(d.j.f6348t2));
        imageView2.setImageDrawable(v5.g(d.j.f6318n2));
        imageView3.setImageDrawable(v5.g(d.j.f6303k2));
        imageView4.setImageDrawable(v5.g(d.j.f6363w2));
        imageView5.setImageDrawable(v5.g(d.j.f6348t2));
        this.E = v5.g(d.j.f6343s2);
        j3.a(imageView, getResources().getString(d.h.f6245l));
        this.F = v5.n(d.j.f6358v2, d.g.f6230q);
        this.G = v5.n(d.j.f6308l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f826m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f822i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v5.a(d.j.f6323o2, true));
        int f6 = v5.f(d.j.f6288h2, -1);
        if (f6 != -1) {
            setMaxWidth(f6);
        }
        this.J = v5.p(d.j.f6313m2);
        this.Q = v5.p(d.j.f6338r2);
        int k6 = v5.k(d.j.f6298j2, -1);
        if (k6 != -1) {
            setImeOptions(k6);
        }
        int k7 = v5.k(d.j.f6293i2, -1);
        if (k7 != -1) {
            setInputType(k7);
        }
        setFocusable(v5.a(d.j.f6283g2, true));
        v5.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f835x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.M);
        g0();
    }
}
