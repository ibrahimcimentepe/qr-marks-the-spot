This class diagram is our system's common usage. One creates a game and the other enrolls it. Also admin can change anything related to games.

![http://qr-marks-the-spot.googlecode.com/files/class1.jpeg](http://qr-marks-the-spot.googlecode.com/files/class1.jpeg)

We use MVC Pattern for this project.

# Controller #
## Components ##
  * Data Validation
  * QR Code Generation
  * File Upload Handling -Users May upload Images etc-
  * Access Control
  * Form Validation
  * Security Controls
  * Google Map Integration
  * Game Step Handlers

## Interactions ##
  * Show QR Code --> View
  * Authorize for Next Game Step -- > Model
  * Store Form Data -> Model
  * Show Game Location -> View
  * Store Files -> Model


# View #
  * Game Calendar
  * Game Creating Utilities
  * Tutorial Pages
  * Forums, Comments, Tracking Games
  * Profile Page
  * Advertisements
  * Forms Management (Authentication, Submit Pages, Election)
## Components ##

## Interactions ##

# Model #

![http://qr-marks-the-spot.googlecode.com/files/MVC.jpeg](http://qr-marks-the-spot.googlecode.com/files/MVC.jpeg)

## Components ##
Account Database
History Database

## Interactions ##