# Appointment Service Milestone

> **Status:** Historical CS 320 milestone. The appointment model, in-memory service, and one JUnit model test are present, but the repository has no committed Maven or Gradle build definition and no fresh test result.

This Java milestone implements the appointment portion of a later three-service testing project. It is retained as a focused record of the initial requirement and validation work; the [integrated CS 320 repository](https://github.com/mf0zz13/CS-320-Reflection) is the canonical project to review.

## Implemented behavior

- <code>Appointment</code> accepts an ID no longer than 10 characters.
- Appointment dates cannot be in the past.
- Descriptions cannot be null or longer than 50 characters.
- <code>AppointmentService</code> stores appointments in an in-memory <code>HashMap</code>.
- The service generates sequential string IDs and provides add and delete operations.

## Repository contents

- [AppointmentService/src/Appointment.java](./AppointmentService/src/Appointment.java) — appointment fields and validation
- [AppointmentService/src/AppointmentService.java](./AppointmentService/src/AppointmentService.java) — in-memory add/delete service
- [AppointmentService/Tests/AppointmentTest.java](./AppointmentService/Tests/AppointmentTest.java) — JUnit 5 constructor-validation cases

## Validation status and limitations

The test source checks three invalid constructor cases: an overlength ID, a past date, and an overlength description. It does not cover the service operations, getters, null date behavior, boundary values, or persistence. Because no build manifest or wrapper is committed, this repository does not define a reproducible test command on its own.

The later [Contact, Task, and Appointment Services project](https://github.com/mf0zz13/CS-320-Reflection) packages all three domains in a Maven layout and contains the broader service-test set, along with a documented appointment-test defect that still needs correction.
