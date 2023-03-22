package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.SalaryCommand;
import seedu.address.logic.commands.exceptions.exceptions.ParseException;
import seedu.address.model.job.Order;

/**
 * Parses input arguments and creates a new SalaryCommand object
 */
public class SalaryCommandParser implements Parser<SalaryCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the SalaryCommand
     * and returns a SalaryCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public SalaryCommand parse(String args) throws ParseException {
        try {
            Order order = ParserUtil.parseOrder(args);
            return new SalaryCommand(order);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SalaryCommand.MESSAGE_USAGE), pe);
        }
    }
}
