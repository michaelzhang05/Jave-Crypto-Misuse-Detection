package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class x2 extends w.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    private final SearchView f1258l;

    /* renamed from: m, reason: collision with root package name */
    private final SearchableInfo f1259m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f1260n;

    /* renamed from: o, reason: collision with root package name */
    private final WeakHashMap f1261o;

    /* renamed from: p, reason: collision with root package name */
    private final int f1262p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1263q;

    /* renamed from: r, reason: collision with root package name */
    private int f1264r;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f1265s;

    /* renamed from: t, reason: collision with root package name */
    private int f1266t;

    /* renamed from: u, reason: collision with root package name */
    private int f1267u;

    /* renamed from: v, reason: collision with root package name */
    private int f1268v;

    /* renamed from: w, reason: collision with root package name */
    private int f1269w;

    /* renamed from: x, reason: collision with root package name */
    private int f1270x;

    /* renamed from: y, reason: collision with root package name */
    private int f1271y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1272a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1273b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1274c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1275d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1276e;

        public a(View view) {
            this.f1272a = (TextView) view.findViewById(R.id.text1);
            this.f1273b = (TextView) view.findViewById(R.id.text2);
            this.f1274c = (ImageView) view.findViewById(R.id.icon1);
            this.f1275d = (ImageView) view.findViewById(R.id.icon2);
            this.f1276e = (ImageView) view.findViewById(d.f.f6204q);
        }
    }

    public x2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1263q = false;
        this.f1264r = 1;
        this.f1266t = -1;
        this.f1267u = -1;
        this.f1268v = -1;
        this.f1269w = -1;
        this.f1270x = -1;
        this.f1271y = -1;
        this.f1258l = searchView;
        this.f1259m = searchableInfo;
        this.f1262p = searchView.getSuggestionCommitIconResId();
        this.f1260n = context;
        this.f1261o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1261o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1261o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1265s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1260n.getTheme().resolveAttribute(d.a.I, typedValue, true);
            this.f1265s = this.f1260n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1265s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1260n.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e6) {
            obj = e6.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", obj);
        return null;
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1261o.containsKey(flattenToShortString)) {
            Drawable m6 = m(componentName);
            this.f1261o.put(flattenToShortString, m6 != null ? m6.getConstantState() : null);
            return m6;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1261o.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1260n.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n6 = n(this.f1259m.getSearchActivity());
        return n6 != null ? n6 : this.f1260n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1260n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e6) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e6);
                }
            }
        } catch (FileNotFoundException e7) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e7.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1260n.getPackageName() + "/" + parseInt;
            Drawable k6 = k(str2);
            if (k6 != null) {
                return k6;
            }
            Drawable e6 = androidx.core.content.a.e(this.f1260n, parseInt);
            A(str2, e6);
            return e6;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k7 = k(str);
            if (k7 != null) {
                return k7;
            }
            Drawable q6 = q(Uri.parse(str));
            A(str, q6);
            return q6;
        }
    }

    private Drawable t(Cursor cursor) {
        int i6 = this.f1269w;
        if (i6 == -1) {
            return null;
        }
        Drawable s5 = s(cursor.getString(i6));
        return s5 != null ? s5 : p();
    }

    private Drawable u(Cursor cursor) {
        int i6 = this.f1270x;
        if (i6 == -1) {
            return null;
        }
        return s(cursor.getString(i6));
    }

    private static String w(Cursor cursor, int i6) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e6);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i6) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i6);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // w.a, w.b.a
    public CharSequence a(Cursor cursor) {
        String o6;
        String o7;
        if (cursor == null) {
            return null;
        }
        String o8 = o(cursor, "suggest_intent_query");
        if (o8 != null) {
            return o8;
        }
        if (this.f1259m.shouldRewriteQueryFromData() && (o7 = o(cursor, "suggest_intent_data")) != null) {
            return o7;
        }
        if (!this.f1259m.shouldRewriteQueryFromText() || (o6 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o6;
    }

    @Override // w.a, w.b.a
    public void b(Cursor cursor) {
        if (this.f1263q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1266t = cursor.getColumnIndex("suggest_text_1");
                this.f1267u = cursor.getColumnIndex("suggest_text_2");
                this.f1268v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1269w = cursor.getColumnIndex("suggest_icon_1");
                this.f1270x = cursor.getColumnIndex("suggest_icon_2");
                this.f1271y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e6);
        }
    }

    @Override // w.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1258l.getVisibility() == 0 && this.f1258l.getWindowVisibility() == 0) {
            try {
                Cursor v5 = v(this.f1259m, charSequence2, 50);
                if (v5 != null) {
                    v5.getCount();
                    return v5;
                }
            } catch (RuntimeException e6) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e6);
            }
        }
        return null;
    }

    @Override // w.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i6 = this.f1271y;
        int i7 = i6 != -1 ? cursor.getInt(i6) : 0;
        if (aVar.f1272a != null) {
            z(aVar.f1272a, w(cursor, this.f1266t));
        }
        if (aVar.f1273b != null) {
            String w5 = w(cursor, this.f1268v);
            CharSequence l6 = w5 != null ? l(w5) : w(cursor, this.f1267u);
            if (TextUtils.isEmpty(l6)) {
                TextView textView = aVar.f1272a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1272a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1272a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1272a.setMaxLines(1);
                }
            }
            z(aVar.f1273b, l6);
        }
        ImageView imageView = aVar.f1274c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1275d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i8 = this.f1264r;
        if (i8 != 2 && (i8 != 1 || (i7 & 1) == 0)) {
            aVar.f1276e.setVisibility(8);
            return;
        }
        aVar.f1276e.setVisibility(0);
        aVar.f1276e.setTag(aVar.f1272a.getText());
        aVar.f1276e.setOnClickListener(this);
    }

    @Override // w.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View g6 = g(this.f1260n, c(), viewGroup);
            if (g6 != null) {
                ((a) g6.getTag()).f1272a.setText(e6.toString());
            }
            return g6;
        }
    }

    @Override // w.a, android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View h6 = h(this.f1260n, c(), viewGroup);
            if (h6 != null) {
                ((a) h6.getTag()).f1272a.setText(e6.toString());
            }
            return h6;
        }
    }

    @Override // w.c, w.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h6 = super.h(context, cursor, viewGroup);
        h6.setTag(new a(h6));
        ((ImageView) h6.findViewById(d.f.f6204q)).setImageResource(this.f1262p);
        return h6;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1258l.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1260n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i6) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i6 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i6));
        }
        return this.f1260n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i6) {
        this.f1264r = i6;
    }
}
