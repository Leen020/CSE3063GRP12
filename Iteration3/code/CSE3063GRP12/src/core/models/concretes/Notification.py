from datetime import datetime

class Notification:
    def __init__(self, message=None, date=None, read=None):
        self.message = message
        self.date = date if date is not None else datetime.now()  # using datetime for date handling
        self.read = read
    
    def to_dict(self):
        return {
            "message": self.message,
            "date": self.date if isinstance(self.date, str) else self.date.strftime("%d/%m/%Y %H:%M:%S"),
            "read": self.read
        }

