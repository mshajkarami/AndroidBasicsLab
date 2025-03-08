package ir.hajkarami.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ObservablePerson (person: Person) : BaseObservable() {
    var name : String = person.name

        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    var email: String = person.email
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }
}