package cm.aptoide.pt.reviews;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.reviews.LanguageFilterHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LanguageFilterSpinnerHelper {
    private final Context context;
    private final LanguageFilterHelper languageFilterHelper;
    private final Resources resources;
    private final Spinner spinner;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface OnItemSelected {
        void onItemSelected(LanguageFilterHelper.LanguageFilter languageFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LanguageFilterSpinnerHelper(Spinner spinner) {
        this.spinner = spinner;
        Resources resources = spinner.getResources();
        this.resources = resources;
        this.context = spinner.getContext();
        this.languageFilterHelper = new LanguageFilterHelper(resources);
    }

    private List<String> createSpinnerAdapterRowsList() {
        List<LanguageFilterHelper.LanguageFilter> languageFilterList = this.languageFilterHelper.getLanguageFilterList();
        LinkedList linkedList = new LinkedList();
        Iterator<LanguageFilterHelper.LanguageFilter> it = languageFilterList.iterator();
        while (it.hasNext()) {
            linkedList.add(this.resources.getString(it.next().getStringId()));
        }
        return linkedList;
    }

    private int getDefaultSelectionId() {
        return this.languageFilterHelper.getCurrentLanguageFirst().getStringId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupLanguageSpinnerClickListener$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(View view) {
        this.spinner.performClick();
    }

    private void setAdapter(SpinnerAdapter spinnerAdapter, OnItemSelected onItemSelected) {
        this.spinner.setAdapter(spinnerAdapter);
        setupOnItemSelectedListener(onItemSelected);
        setSelection(this.resources.getString(getDefaultSelectionId()));
    }

    private void setSelection(String str) {
        for (int i2 = 0; i2 < this.spinner.getAdapter().getCount(); i2++) {
            if (str.equals(this.spinner.getAdapter().getItem(i2))) {
                this.spinner.setSelection(i2);
            }
        }
    }

    private SpinnerAdapter setupCommentsFilterLanguageSpinnerAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.context, R.layout.simple_language_spinner_item, createSpinnerAdapterRowsList());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return arrayAdapter;
    }

    private void setupLanguageSpinnerClickListener(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.reviews.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LanguageFilterSpinnerHelper.this.a(view2);
            }
        });
    }

    private void setupOnItemSelectedListener(final OnItemSelected onItemSelected) {
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: cm.aptoide.pt.reviews.LanguageFilterSpinnerHelper.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
                if (view instanceof TextView) {
                    CharSequence text = ((TextView) view).getText();
                    LanguageFilterHelper.LanguageFilter languageFilter = null;
                    for (LanguageFilterHelper.LanguageFilter languageFilter2 : LanguageFilterSpinnerHelper.this.languageFilterHelper.getLanguageFilterList()) {
                        if (text.equals(LanguageFilterSpinnerHelper.this.resources.getString(languageFilter2.getStringId()))) {
                            languageFilter = new LanguageFilterHelper.LanguageFilter(languageFilter2);
                        }
                    }
                    onItemSelected.onItemSelected(languageFilter);
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setup(OnItemSelected onItemSelected) {
        setAdapter(setupCommentsFilterLanguageSpinnerAdapter(), onItemSelected);
        setupLanguageSpinnerClickListener((View) this.spinner.getParent());
    }
}
